package com.andreao.salestaxes;

import java.util.HashSet;
import java.util.Set;

import com.andreao.salestaxes.model.ProductType;
import com.andreao.salestaxes.model.Tax;

public class AppConfig {
	
	public static final Set<Tax> TAXES = new HashSet<>();

	static {
		TAXES.add(new Tax("Basic Sales Tax", 0.1, ProductType.OTHER));
		TAXES.add(new Tax("Import Duty", 0.05, ProductType.getAll(), true));
	}
	
	private AppConfig() {
		super();
	}
	
}
