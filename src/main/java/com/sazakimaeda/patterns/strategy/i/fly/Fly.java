package com.sazakimaeda.patterns.strategy.i.fly;

public class Fly implements iFlyble{
    @Override
    public void fly() {
        System.out.println("Fly");
    }
}
