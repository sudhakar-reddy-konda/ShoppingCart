package com.example.tdd.shoppingcart;

public enum Product {

	Apple("Apple", 0.60), Orange("Orange", 0.25);

	private String name;
	private double price;

	Product(String name, double price) {
		this.name = name;
		this.price = price;

	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

}
