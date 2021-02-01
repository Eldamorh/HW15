package com.eldus;

public class SpecialOrder extends Order {
    Order dispatch() {
        return this;
    }
}
