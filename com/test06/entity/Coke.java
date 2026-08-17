package com.test06.entity;

public class Coke extends Drink{

    public final int COKE_PRICE = 50;

    public Coke() {
        setPrice(COKE_PRICE);
    }

    public Coke(int price) {
        super(price);
    }

    public String toString() {
        return "콜라";

    }
    
}
