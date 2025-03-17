package com.sazakimaeda.patterns.factory.first.each;

import com.sazakimaeda.patterns.factory.first.Pizza;

public class PizzaPepper implements Pizza {

    @Override
    public void bakery() {
        System.out.println("Bakery Pepper");
    }

    @Override
    public double cost() {
        return 9.9;
    }
}
