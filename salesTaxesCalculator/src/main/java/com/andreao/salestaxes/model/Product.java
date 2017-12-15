package com.andreao.salestaxes.model;

import java.math.BigDecimal;

public class Product {
	
	private String name;
	private BigDecimal price = BigDecimal.ZERO;
	private BigDecimal salesTaxes = BigDecimal.ZERO;
	private boolean imported = false;
	private ProductType productType = ProductType.OTHER;
	
	public Product() {
		super();
	}
	
	public Product(String name, BigDecimal price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public Product(String name, BigDecimal price, ProductType productType) {
		super();
		this.name = name;
		this.price = price;
		this.productType = productType;
	}
	
	public Product(String name, BigDecimal price, boolean imported) {
		super();
		this.name = name;
		this.price = price;
		this.imported = imported;
	}

	public Product(String name, BigDecimal price, ProductType productType, boolean imported) {
		super();
		this.name = name;
		this.price = price;
		this.imported = imported;
		this.productType = productType;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public boolean isImported() {
		return imported;
	}
	public void setImported(boolean imported) {
		this.imported = imported;
	}
	public ProductType getProductType() {
		return productType;
	}
	public void setProductType(ProductType productType) {
		this.productType = productType;
	}
	public BigDecimal getSalesTaxes() {
		return salesTaxes;
	}
	public void setSalesTaxes(BigDecimal salesTaxes) {
		this.salesTaxes = salesTaxes;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (imported ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((productType == null) ? 0 : productType.hashCode());
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
		Product other = (Product) obj;
		if (imported != other.imported)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (productType != other.productType)
			return false;
		return true;
	}

}
