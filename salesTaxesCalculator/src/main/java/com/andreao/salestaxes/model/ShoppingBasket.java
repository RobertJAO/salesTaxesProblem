package com.andreao.salestaxes.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShoppingBasket {

	private List<Product> products = new ArrayList<>();
	private BigDecimal totalPrice = BigDecimal.ZERO;
	private BigDecimal totalSalesTaxes = BigDecimal.ZERO;

	public int getProductQuantity(Product p) {
		int count = 0;
		for(Product pp : this.getProducts()) {
			if(pp.equals(p)) {
				count++;
			}
		}
		return count;
	}
	
	public BigDecimal getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}
	public BigDecimal getTotalSalesTaxes() {
		return totalSalesTaxes;
	}
	public void setTotalSalesTaxes(BigDecimal totalSalesTaxes) {
		this.totalSalesTaxes = totalSalesTaxes;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
}
