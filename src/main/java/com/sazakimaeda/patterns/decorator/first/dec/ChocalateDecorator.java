package com.sazakimaeda.patterns.decorator.first.dec;

import com.sazakimaeda.patterns.decorator.first.dr.Drink;

public class ChocalateDecorator extends Decorator{
    public ChocalateDecorator(Drink dr) {
        super(dr);
    }

    @Override
    public int cost() {
        return this.drink.cost() + 5;
    }
}
