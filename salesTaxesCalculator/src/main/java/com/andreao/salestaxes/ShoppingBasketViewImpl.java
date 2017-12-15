package com.andreao.salestaxes;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.LinkedHashSet;

import com.andreao.salestaxes.model.Product;
import com.andreao.salestaxes.model.ShoppingBasket;

public class ShoppingBasketViewImpl implements ShoppingBasketView {

	private NumberFormat numberFormat;
	private static final String PRODUCT_TEMPLATE = "%d %s: %s";
	private static final String TOT_SALES_TAXES_TEMPLATE = "Sales Taxes: %s";
	private static final String TOT_TEMPLATE = "Total: %s";
	
	public ShoppingBasketViewImpl() {
		this.numberFormat = DecimalFormat.getInstance();
		this.numberFormat.setMaximumFractionDigits(2);
		this.numberFormat.setRoundingMode(RoundingMode.HALF_UP);
		this.numberFormat.setMinimumFractionDigits(2);
	}
	
	public void print(ShoppingBasket shoppingBasket) {
		StringBuilder sb = new StringBuilder();
		for(Product p : new LinkedHashSet<>(shoppingBasket.getProducts())) {
			sb.append(String.format(PRODUCT_TEMPLATE, shoppingBasket.getProductQuantity(p), p.getName(), this.numberFormat.format(p.getPrice())));
			sb.append(System.lineSeparator());
		}
		sb.append(String.format(TOT_SALES_TAXES_TEMPLATE, this.numberFormat.format(shoppingBasket.getTotalSalesTaxes())));
		sb.append(System.lineSeparator());
		sb.append(String.format(TOT_TEMPLATE, this.numberFormat.format(shoppingBasket.getTotalPrice())));
		sb.append(System.lineSeparator());
		System.out.print(sb.toString());
	}

}
