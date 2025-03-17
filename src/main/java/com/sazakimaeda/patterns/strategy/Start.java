package com.sazakimaeda.patterns.strategy;


import com.sazakimaeda.patterns.strategy.i.eat.IEatable;
import com.sazakimaeda.patterns.strategy.i.eat.NoEatable;
import com.sazakimaeda.patterns.strategy.i.fly.NoFly;
import com.sazakimaeda.patterns.strategy.i.fly.iFlyble;

public class Start {
    public static void main(String[] args) {
        iFlyble iflyble = new NoFly();
        IEatable ietable = new NoEatable();
        Duck duck = new Duck(iflyble, ietable);
        Duck duck2 = new Duck(new NoFly());
        duck.fly();
        duck.eat();
        duck2.fly();
    }
}
