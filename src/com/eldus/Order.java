package com.eldus;

import java.util.Date;

public abstract class Order {
    Date date;
    String number;

    Order() {
        date = new Date();
        number = Long.toString(date.getTime());
    }

    boolean confirm() {
        return true;
    }


    boolean close() {
        return false;
    }
}
