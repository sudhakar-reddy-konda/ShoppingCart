package com.example.tdd.shoppingcart;

import java.util.ArrayList;
import java.util.List;

public class Cart {

	private List<Item> items = new ArrayList<>();

	public int getItemCount() {
		if (items.isEmpty())
			return 0;
		int itemCount =0;
		for (Item item:items) {
			itemCount+= item.getItemQty();
		} 
		return itemCount;

	}

	public void addItem(Item item) {
		items.add(item);

	}

	public double getCartTotalAmount() {
		double totalAmont = 0;
		for (Item item:items) {
			totalAmont+= item.getItemQty()* item.getItemPrice();
		}
		return totalAmont;
	}

}
