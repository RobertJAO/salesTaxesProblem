package com.andreao.salestaxes.test;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.andreao.salestaxes.business.FinalPriceCalculator;
import com.andreao.salestaxes.business.FinalPriceCalculatorImpl;
import com.andreao.salestaxes.model.Product;
import com.andreao.salestaxes.model.ProductType;

public class FinalPriceCalculatorTest {

	private FinalPriceCalculator finalPriceCalculator;
	
	@Before
	public void init() {
		finalPriceCalculator = new FinalPriceCalculatorImpl();
	}
	
	@Test
	public void shouldCalculateTheFinalPrice() {
		Product p = new Product("box of imported chocolates", new BigDecimal(11.25), ProductType.FOOD, true);
		BigDecimal finalPrice = finalPriceCalculator.calculateFinalPrice(p, BigDecimal.valueOf(0.60));
		Assert.assertEquals(11.85, finalPrice.doubleValue(), 0);
	}
	
}
