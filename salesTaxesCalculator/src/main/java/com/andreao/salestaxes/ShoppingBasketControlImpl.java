package com.andreao.salestaxes;

import static com.andreao.salestaxes.AppConfig.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.andreao.salestaxes.business.FinalPriceCalculator;
import com.andreao.salestaxes.business.FinalPriceCalculatorImpl;
import com.andreao.salestaxes.business.SalesTaxesCalculator;
import com.andreao.salestaxes.business.SalesTaxesCalculatorRounded;
import com.andreao.salestaxes.helper.bean.BeanMapperHelper;
import com.andreao.salestaxes.model.Product;
import com.andreao.salestaxes.model.ShoppingBasket;
import com.andreao.salestaxes.model.Tax; 

public class ShoppingBasketControlImpl implements ShoppingBasketControl {

	private ShoppingBasket shoppingBasket;
	private ShoppingBasketView shoppingBasketView;
	private final SalesTaxesCalculator salesTaxesCalculator;
	private final FinalPriceCalculator finalPriceCalculator;
	
	public ShoppingBasketControlImpl() {
		this.salesTaxesCalculator = new SalesTaxesCalculatorRounded();
		this.finalPriceCalculator = new FinalPriceCalculatorImpl();
		this.shoppingBasket = new ShoppingBasket();
		this.shoppingBasketView = new ShoppingBasketViewImpl();
	}

	@Override
	public void addProduct(Product p) {
		this.shoppingBasket.getProducts().add(BeanMapperHelper.map(p, Product.class));
	}
	
	@Override
	public void removeProduct(Product p) {
		this.shoppingBasket.getProducts().remove(p);
	}
	
	@Override
	public int getProductQuantity(Product p) {
		return this.shoppingBasket.getProductQuantity(p);
	}
	
	@Override
	public void updatePrices() {
		this.shoppingBasket.setTotalPrice(BigDecimal.ZERO);
		this.shoppingBasket.setTotalSalesTaxes(BigDecimal.ZERO);
		for(Product product : this.shoppingBasket.getProducts()) {
			this.updateProductPrice(product);
			this.shoppingBasket.setTotalSalesTaxes(this.shoppingBasket.getTotalSalesTaxes().add(product.getSalesTaxes()));
			this.shoppingBasket.setTotalPrice(this.shoppingBasket.getTotalPrice().add(product.getPrice()));
		}
	}
	
	private void updateProductPrice(Product p) {
		for(Tax t : TAXES) {
			p.setSalesTaxes(p.getSalesTaxes().add(salesTaxesCalculator.applyTax(p, t)));
		}
		p.setPrice(finalPriceCalculator.calculateFinalPrice(p, p.getSalesTaxes()));
	}
	
	@Override
	public void printContent() {
		this.shoppingBasketView.print(this.shoppingBasket);
	}

	@Override
	public List<Product> getProducts() {
		return new ArrayList<>(this.shoppingBasket.getProducts());
	}
	@Override
	public BigDecimal getTotalPrice() {
		return this.shoppingBasket.getTotalPrice();
	}
	@Override
	public BigDecimal getTotalSalesTaxes() {
		return this.shoppingBasket.getTotalSalesTaxes();
	}

}
