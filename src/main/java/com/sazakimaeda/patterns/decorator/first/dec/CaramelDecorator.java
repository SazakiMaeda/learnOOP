package com.sazakimaeda.patterns.decorator.first.dec;

import com.sazakimaeda.patterns.decorator.first.dr.Drink;

public class CaramelDecorator extends Decorator{
    public CaramelDecorator(Drink dr) {
        super(dr);
    }

    @Override
    public int cost() {
        return this.drink.cost() + 1;
    }
}
