package com.andreao.salestaxes.business;

import java.math.BigDecimal;

import com.andreao.salestaxes.model.Product;

public interface FinalPriceCalculator {

	public BigDecimal calculateFinalPrice(Product product, BigDecimal salesTaxesAmount);
	
}
