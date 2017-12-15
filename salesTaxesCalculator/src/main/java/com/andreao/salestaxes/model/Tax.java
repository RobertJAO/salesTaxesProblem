package com.andreao.salestaxes.model;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Tax {

	private String name;
	private double value;
	private Set<ProductType> productTypes = ProductType.getAll();
	private boolean onImportedOnly;

	public Tax() {
		super();
	}

	public Tax(String name, double value) {
		super();
		this.name = name;
		this.value = value;
	}
	
	public Tax(String name, double value, Set<ProductType> productTypes) {
		super();
		this.name = name;
		this.value = value;
		this.productTypes = productTypes;
	}
	
	public Tax(String name, double value, ProductType... productTypes) {
		super();
		this.name = name;
		this.value = value;
		this.productTypes = new HashSet<>(Arrays.asList(productTypes));
	}
	
	public Tax(String name, double value, boolean onImportedOnly) {
		super();
		this.name = name;
		this.value = value;
		this.onImportedOnly = onImportedOnly;
	}
	
	public Tax(String name, double value, Set<ProductType> productTypes, boolean onImportedOnly) {
		super();
		this.name = name;
		this.value = value;
		this.productTypes = productTypes;
		this.onImportedOnly = onImportedOnly;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	public Set<ProductType> getProductTypes() {
		return productTypes;
	}
	public void setProductTypes(Set<ProductType> productTypes) {
		this.productTypes = productTypes;
	}
	public boolean isOnImportedOnly() {
		return onImportedOnly;
	}
	public void setOnImportedOnly(boolean onImportedOnly) {
		this.onImportedOnly = onImportedOnly;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (onImportedOnly ? 1231 : 1237);
		result = prime * result + ((productTypes == null) ? 0 : productTypes.hashCode());
		long temp;
		temp = Double.doubleToLongBits(value);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tax other = (Tax) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (onImportedOnly != other.onImportedOnly)
			return false;
		if (productTypes == null) {
			if (other.productTypes != null)
				return false;
		} else if (!productTypes.equals(other.productTypes))
			return false;
		if (Double.doubleToLongBits(value) != Double.doubleToLongBits(other.value))
			return false;
		return true;
	}
	
}
