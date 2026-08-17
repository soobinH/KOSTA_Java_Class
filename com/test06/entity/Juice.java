package com.test06.entity;

public class Juice extends Drink{
    public final int JUICE_PRICE = 200;

    public Juice() {
        setPrice(JUICE_PRICE);

    }

    public Juice(int price) {
        super(price);
    }

    public String toString() {
        return "주스";

    }
}
