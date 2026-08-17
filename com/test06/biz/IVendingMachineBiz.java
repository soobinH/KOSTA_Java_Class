package com.test06.biz;

import com.test06.entity.Drink;

public interface IVendingMachineBiz {
    abstract public void cartDrink(Drink drink);
    abstract public void printCart();
    abstract public void printDrinkList(Drink[] drinkList);
}
