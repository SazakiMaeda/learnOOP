package com.sazakimaeda.patterns.decorator.second.d;

import com.sazakimaeda.patterns.decorator.second.i.Position;

public abstract class Decorator implements Position {
    Position position;
    private Decorator() {}

    public Decorator(Position p) {
        this.position = p;
    }
}
