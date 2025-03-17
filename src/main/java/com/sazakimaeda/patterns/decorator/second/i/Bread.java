package com.sazakimaeda.patterns.decorator.second.i;

public class Bread implements Position{

    @Override
    public int cost() {
        System.out.println("Bread cost: ");
        return 10;
    }
}
