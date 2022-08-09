package com.twu.refactoring;

import java.util.List;

public class Order {
    String customerName;
    String addr;
    List<LineItem> li;

    public Order(String customerName, String addr, List<LineItem> li) {
        this.customerName = customerName;
        this.addr = addr;
        this.li = li;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerAddress() {
        return addr;
    }

    public List<LineItem> getLineItems() {
        return li;
    }
}
