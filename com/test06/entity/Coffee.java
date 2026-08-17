package com.test06.entity;

public class Coffee extends Drink{
    public final int COFFEE_PRICE = 100;

    public Coffee() {
        setPrice(COFFEE_PRICE);
    }

    public Coffee(int price) {
        super(price);
    }

    public String toString() {
        return "커피";
    }
}
