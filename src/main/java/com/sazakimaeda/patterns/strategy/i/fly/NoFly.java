package com.sazakimaeda.patterns.strategy.i.fly;

public class NoFly implements iFlyble{
    @Override
    public void fly() {
        System.out.println("NoFly");
    }
}
