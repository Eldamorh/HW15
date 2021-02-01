package com.eldus;

public class NormalOrder extends Order {
    Order dispatch() {
        return new NormalOrder();
    }

    void receive() {

    }
}
