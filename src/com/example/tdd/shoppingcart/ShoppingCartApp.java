package com.example.tdd.shoppingcart;

public class ShoppingCartApp {

	public static void main(String[] args) {

		String[] shoppingList = { Product.Apple.getName(), Product.Apple.getName(), Product.Orange.getName(),
				Product.Orange.getName(), Product.Orange.getName() };

		Cart shoppingCart = new Cart();
		Item shoppingItem = null;
		Product product = null;
		for (String item : shoppingList) {
			product = Product.valueOf(item);
			shoppingItem = new Item(product.getName(), 1, product.getPrice());
			shoppingCart.addItem(shoppingItem);
		}

		System.out.println("Total Basket Amount : " + shoppingCart.getCartTotalAmount());
	}

}
