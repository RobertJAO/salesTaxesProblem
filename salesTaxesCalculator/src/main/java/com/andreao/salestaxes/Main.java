package com.andreao.salestaxes;

import java.math.BigDecimal;

import com.andreao.salestaxes.model.Product;
import com.andreao.salestaxes.model.ProductType;

public class Main {

	public static void main(String[] args) {
		System.out.println("Output 1");
		Product p1 = new Product("book", new BigDecimal(12.49), ProductType.BOOK);
		Product p2 = new Product("music CD", new BigDecimal(14.99));
		Product p3 = new Product("chocolate bar", new BigDecimal(0.85), ProductType.FOOD);
		ShoppingBasketControl shoppingBasketControl = new ShoppingBasketControlImpl();
		shoppingBasketControl.addProduct(p1);
		shoppingBasketControl.addProduct(p2);
		shoppingBasketControl.addProduct(p3);
		shoppingBasketControl.updatePrices();
		shoppingBasketControl.printContent();
		
		System.out.println("Output 2");
		Product p4 = new Product("imported box of chocolates", new BigDecimal(10.0), ProductType.FOOD, true);
		Product p5 = new Product("imported bottle of perfume", new BigDecimal(47.50), true);
		shoppingBasketControl = new ShoppingBasketControlImpl();
		shoppingBasketControl.addProduct(p4);
		shoppingBasketControl.addProduct(p5);
		shoppingBasketControl.updatePrices();
		shoppingBasketControl.printContent();
		
		System.out.println("Output 3");
		Product p6 = new Product("imported bottle of perfume", new BigDecimal(27.99), true);
		Product p7 = new Product("bottle of perfume", new BigDecimal(18.99));
		Product p8 = new Product("packet of headache pills", new BigDecimal(9.75), ProductType.MEDICAL);
		Product p9 = new Product("box of imported chocolates", new BigDecimal(11.25), ProductType.FOOD, true);
		shoppingBasketControl = new ShoppingBasketControlImpl();
		shoppingBasketControl.addProduct(p6);
		shoppingBasketControl.addProduct(p7);
		shoppingBasketControl.addProduct(p8);
		shoppingBasketControl.addProduct(p9);
		shoppingBasketControl.updatePrices();
		shoppingBasketControl.printContent();
	}
	
}
