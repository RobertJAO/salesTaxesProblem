package com.andreao.salestaxes.model;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public enum ProductType {
	BOOK, FOOD, MEDICAL, OTHER;

	public static Set<ProductType> getAll() {
		return new HashSet<>(Arrays.asList(ProductType.values()));
	}
}
