package com.example.tdd.shoppingcart;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ShoppingCartAppTest {

	@Test
	public void createEmptyShoppingCart() {
		Cart shoppingCart = new Cart();
		assertEquals(0, shoppingCart.getItemCount());
	}
	
	@Test
	public void addOneItemToShoppingCart() {
		Cart shoppingCart = new Cart();
		Item item = new Item( Product.Apple.getName() ,1,Product.Apple.getPrice());
		shoppingCart.addItem(item);
		assertEquals(1, shoppingCart.getItemCount());
		assertEquals(0.60, shoppingCart.getCartTotalAmount(),0.0);
	}
	
	@Test
	public void addMultipleItemsToShoppingCart() {
		Cart shoppingCart = new Cart();
		Item item = new Item(Product.Apple.getName() ,1,Product.Apple.getPrice());
		shoppingCart.addItem(item);
		item = new Item(Product.Orange.getName() ,2,Product.Orange.getPrice());
		shoppingCart.addItem(item);
		assertEquals(3, shoppingCart.getItemCount());
		assertEquals(1.10, shoppingCart.getCartTotalAmount(),0.0);
		
	}
	
}
