package com.sazakimaeda.patterns.decorator.first.dec;

import com.sazakimaeda.patterns.decorator.first.dr.Drink;

public abstract class Decorator implements Drink {
    Drink drink;
    private Decorator() {}

    public Decorator(Drink dr) {
        this.drink = dr;
    }

    @Override
    public abstract int cost();
}
