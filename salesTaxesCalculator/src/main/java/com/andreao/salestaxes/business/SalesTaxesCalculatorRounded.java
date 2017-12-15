package com.andreao.salestaxes.business;

import java.math.BigDecimal;

import com.andreao.salestaxes.helper.math.RoundingUtils;
import com.andreao.salestaxes.model.Product;
import com.andreao.salestaxes.model.Tax;

public class SalesTaxesCalculatorRounded extends SalesTaxesCalculatorImpl {

	@Override
	public BigDecimal applyTax(Product product, Tax tax) {
		return RoundingUtils.roundToTheNearest005(super.applyTax(product, tax));
	}
	
}
