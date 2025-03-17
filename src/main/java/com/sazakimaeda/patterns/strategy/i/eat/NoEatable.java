package com.sazakimaeda.patterns.strategy.i.eat;

public class NoEatable implements IEatable{
    @Override
    public void eat() {
        System.out.println("No eat.");
    }
}
