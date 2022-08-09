package com.twu.refactoring;

/**
 * OrderReceipt prints the details of order including customer name, address, description, quantity,
 * price and amount. It also calculates the sales tax @ 10% and prints as part
 * of order. It computes the total order amount (amount of individual lineItems +
 * total sales tax) and prints it.
 * 
 */
public class OrderReceipt {
    private Order o;

    public OrderReceipt(Order o) {
        this.o = o;
	}

	public String printReceipt() {
		StringBuilder output = new StringBuilder();
		printHead(output);
		printCustomer(output);
		printOrderItems(output);
		printSalasTax(output);
		printTotalAmount(output);
		return output.toString();
	}

	private static void printHead(StringBuilder output) {
		output.append("======Printing Orders======\n");
	}

	private void printTotalAmount(StringBuilder output) {
		output.append("Total Amount").append('\t').append(calcTotalAmount());
	}

	private void printSalasTax(StringBuilder output) {
		output.append("Sales Tax").append('\t').append(calcSalesTex());
	}

	private void printOrderItems(StringBuilder output) {
		for (OrderItem orderItem : o.getLineItems()) {
			output.append(orderItem.getDescription());
			output.append('\t');
			output.append(orderItem.getPrice());
			output.append('\t');
			output.append(orderItem.getQuantity());
			output.append('\t');
			output.append(orderItem.totalAmount());
			output.append('\n');
		}
	}

	private double calcTotalAmount() {
		double tot = 0d;
		for (OrderItem orderItem : o.getLineItems()) {
            tot += orderItem.totalAmount() + orderItem.totalAmount() * .10;
		}
		return tot;
	}

	private double calcSalesTex() {
		double totSalesTx = 0d;
		for (OrderItem orderItem : o.getLineItems()) {
			totSalesTx += orderItem.totalAmount() * .10;

		}
		return totSalesTx;
	}

	private void printCustomer(StringBuilder output) {
		output.append(o.getCustomerName());
		output.append(o.getCustomerAddress());
	}

}