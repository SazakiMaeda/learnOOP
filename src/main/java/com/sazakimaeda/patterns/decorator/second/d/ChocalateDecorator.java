package com.sazakimaeda.patterns.decorator.second.d;

import com.sazakimaeda.patterns.decorator.second.i.Position;

public class ChocalateDecorator extends Decorator{
    public ChocalateDecorator(Position p) {
        super(p);
    }

    @Override
    public int cost() {
        return this.position.cost() + 3;
    }
}
