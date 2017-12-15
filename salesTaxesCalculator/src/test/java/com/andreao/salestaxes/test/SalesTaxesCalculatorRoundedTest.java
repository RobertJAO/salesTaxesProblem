package com.andreao.salestaxes.test;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.andreao.salestaxes.business.SalesTaxesCalculator;
import com.andreao.salestaxes.business.SalesTaxesCalculatorRounded;
import com.andreao.salestaxes.model.Product;
import com.andreao.salestaxes.model.ProductType;
import com.andreao.salestaxes.model.Tax;

public class SalesTaxesCalculatorRoundedTest {

	private SalesTaxesCalculator salesTaxesCalculator;
	
	@Before
	public void init() {
		salesTaxesCalculator = new SalesTaxesCalculatorRounded();
	}
	
	@Test
	public void shouldApplyTax() {
		Product p = new Product("box of imported chocolates", new BigDecimal(11.25), ProductType.FOOD, true);
		Tax tax = new Tax("", 0.05, true);
		BigDecimal res = salesTaxesCalculator.applyTax(p, tax);
		Assert.assertEquals(0.60, res.doubleValue(), 0);
	}
	
}
