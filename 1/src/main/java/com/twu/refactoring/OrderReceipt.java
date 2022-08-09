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

		printHeader(output, "======Printing Orders======\n");

		printCustomer(output);

		for (OrderItem orderItem : o.getLineItems()) {
			printHeader(output, orderItem.getDescription());
			output.append('\t');
			output.append(orderItem.getPrice());
			output.append('\t');
			output.append(orderItem.getQuantity());
			output.append('\t');
			output.append(orderItem.totalAmount());
			output.append('\n');
		}

		double totSalesTx = 0d;
		double tot = 0d;
		for (OrderItem orderItem : o.getLineItems()) {
            double salesTax = orderItem.totalAmount() * .10;
            totSalesTx += salesTax;

            tot += orderItem.totalAmount() + salesTax;
		}

		output.append("Sales Tax").append('\t').append(totSalesTx);

		output.append("Total Amount").append('\t').append(tot);
		return output.toString();
	}

	private void printCustomer(StringBuilder output) {
		printHeader(output, o.getCustomerName());
		printHeader(output, o.getCustomerAddress());
	}

	private static void printHeader(StringBuilder output, String str) {
		output.append(str);
	}
}