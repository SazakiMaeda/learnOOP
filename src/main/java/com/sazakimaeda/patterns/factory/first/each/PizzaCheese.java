package com.sazakimaeda.patterns.factory.first.each;

import com.sazakimaeda.patterns.factory.first.Pizza;

public class PizzaCheese implements Pizza {
    @Override
    public void bakery() {
        System.out.println("Bakery Cheese");
    }

    @Override
    public double cost() {
        return 19.9;
    }
}
