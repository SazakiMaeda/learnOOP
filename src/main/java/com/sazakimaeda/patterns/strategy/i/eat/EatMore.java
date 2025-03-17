package com.sazakimaeda.patterns.strategy.i.eat;

public class EatMore implements IEatable{
    @Override
    public void eat() {
        System.out.println("Eat more");
    }
}
