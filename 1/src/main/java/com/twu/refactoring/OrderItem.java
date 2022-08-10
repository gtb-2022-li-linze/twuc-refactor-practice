package com.twu.refactoring;

public class OrderItem {
	private final String description;
	private final double price;
	private final int quantity;

	public OrderItem(String description, double price, int quantity) {
		this.description = description;
		this.price = price;
		this.quantity = quantity;
	}

	double totalAmount() {
        return price * quantity;
    }

	@Override
	public String toString() {
		return String.format("%s\t%s\t%s\t%s\n",description, price, quantity, totalAmount());
	}
}