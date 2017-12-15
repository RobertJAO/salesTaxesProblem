package com.andreao.salestaxes.business;

import java.math.BigDecimal;

import com.andreao.salestaxes.model.Product;

public class FinalPriceCalculatorImpl implements FinalPriceCalculator {

	@Override
	public BigDecimal calculateFinalPrice(Product product, BigDecimal salesTaxesAmount) {
		return product.getPrice().add(salesTaxesAmount);
	}
	
}
