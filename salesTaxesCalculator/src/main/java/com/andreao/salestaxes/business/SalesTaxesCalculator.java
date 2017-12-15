package com.andreao.salestaxes.business;

import java.math.BigDecimal;

import com.andreao.salestaxes.model.Product;
import com.andreao.salestaxes.model.Tax;

public interface SalesTaxesCalculator {
	
	public BigDecimal applyTax(Product product, Tax tax);
	
}
