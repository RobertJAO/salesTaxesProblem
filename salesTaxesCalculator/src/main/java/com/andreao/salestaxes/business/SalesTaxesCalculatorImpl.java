package com.andreao.salestaxes.business;

import java.math.BigDecimal;

import com.andreao.salestaxes.model.Product;
import com.andreao.salestaxes.model.Tax;

public class SalesTaxesCalculatorImpl implements SalesTaxesCalculator {
	
	@Override
	public BigDecimal applyTax(Product product, Tax tax) {
		double salesTaxes = 0;
		if(tax.getProductTypes().contains(product.getProductType())) {
			if(tax.isOnImportedOnly() && product.isImported()) {
				salesTaxes = tax.getValue();
			} else if (!tax.isOnImportedOnly()) {
				salesTaxes = tax.getValue();
			}
		}
		return product.getPrice().multiply(BigDecimal.valueOf(salesTaxes));
	}
	
}
