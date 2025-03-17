package com.sazakimaeda.patterns.decorator.second.d;

import com.sazakimaeda.patterns.decorator.second.i.Position;

public class KorizaDecorator extends Decorator{

    public KorizaDecorator(Position p) {
        super(p);
    }

    @Override
    public int cost() {
        return this.position.cost() + 2;
    }
}
