package com.andreao.salestaxes;

import java.math.BigDecimal;
import java.util.List;

import com.andreao.salestaxes.model.Product;

public interface ShoppingBasketControl {

	public void addProduct(Product p);
	
	public void removeProduct(Product p);
	
	public int getProductQuantity(Product p);
	
	public void updatePrices();
	
	public void printContent();
	
	public List<Product> getProducts();
	
	public BigDecimal getTotalPrice();
	
	public BigDecimal getTotalSalesTaxes();

}
