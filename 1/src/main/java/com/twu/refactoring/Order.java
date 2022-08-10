package com.twu.refactoring;

import java.util.List;

public class Order {
    private static final double DOUBLE = .10;
    String customerName;
    String customerAddress;
    List<OrderItem> items;

    public Order(String customerName, String customerAddress, List<OrderItem> items) {
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.items = items;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public List<OrderItem> getLineItems() {
        return items;
    }

    double calcTotalAmount() {
        double result = 0d;
        for (OrderItem orderItem : getLineItems()) {
            result += orderItem.totalAmount() + orderItem.totalAmount() * DOUBLE;
        }
        return result;
    }

    double calcSalesTex() {
        double totSalesTx = 0d;
        for (OrderItem orderItem : getLineItems()) {
            totSalesTx += orderItem.totalAmount() * .10;

        }
        return totSalesTx;
    }
}
