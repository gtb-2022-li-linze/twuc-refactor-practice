package com.twu.refactoring;

import java.util.List;

public class Order {
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
}
