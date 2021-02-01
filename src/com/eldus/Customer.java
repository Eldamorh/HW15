package com.eldus;

public class Customer {
    String name;
    String location;

    Customer(String name, String location) {
        this.name = name;
        this.location = location;
    }

    void SendOrder() {
        Order order = new SpecialOrder();
    }

    Order receiveOrder() {
        return new NormalOrder();
    }
}
