package com.andreao.salestaxes.test;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import com.andreao.salestaxes.ShoppingBasketControl;
import com.andreao.salestaxes.ShoppingBasketControlImpl;
import com.andreao.salestaxes.model.Product;
import com.andreao.salestaxes.model.ProductType;

public class ShoppingBasketControlTest {

	private ShoppingBasketControl shoppingBasketControl;
	
	@Before
	public void init() {
		this.shoppingBasketControl = new ShoppingBasketControlImpl();
	}
	
	@Test
	public void shouldProduceOutput1() {
		System.out.println("Output 1");
		Product p1 = new Product("book", new BigDecimal(12.49), ProductType.BOOK);
		Product p2 = new Product("music CD", new BigDecimal(14.99));
		Product p3 = new Product("chocolate bar", new BigDecimal(0.85), ProductType.FOOD);
		shoppingBasketControl.addProduct(p1);
		shoppingBasketControl.addProduct(p2);
		shoppingBasketControl.addProduct(p3);
		shoppingBasketControl.updatePrices();
		shoppingBasketControl.printContent();
	}
	
	@Test
	public void shouldProduceOutput2() {
		System.out.println("Output 2");
		Product p1 = new Product("imported box of chocolates", new BigDecimal(10.0), ProductType.FOOD, true);
		Product p2 = new Product("imported bottle of perfume", new BigDecimal(47.50), true);
		shoppingBasketControl.addProduct(p1);
		shoppingBasketControl.addProduct(p2);
		shoppingBasketControl.updatePrices();
		shoppingBasketControl.printContent();
	}
	
	@Test
	public void shouldProduceOutput3() {
		System.out.println("Output 3");
		Product p1 = new Product("imported bottle of perfume", new BigDecimal(27.99), true);
		Product p2 = new Product("bottle of perfume", new BigDecimal(18.99));
		Product p3 = new Product("packet of headache pills", new BigDecimal(9.75), ProductType.MEDICAL);
		Product p4 = new Product("box of imported chocolates", new BigDecimal(11.25), ProductType.FOOD, true);
		shoppingBasketControl.addProduct(p1);
		shoppingBasketControl.addProduct(p2);
		shoppingBasketControl.addProduct(p3);
		shoppingBasketControl.addProduct(p4);
		shoppingBasketControl.updatePrices();
		shoppingBasketControl.printContent();
	}
	
}
