package com.sazakimaeda.patterns.strategy;

import com.sazakimaeda.patterns.strategy.i.eat.IEatable;
import com.sazakimaeda.patterns.strategy.i.fly.iFlyble;
import lombok.Setter;

@Setter
public class Duck implements iFlyble, IEatable {
    private iFlyble iflyble;
    private IEatable ieatable;

    public Duck(iFlyble iflyble, IEatable ieatable) {
        this.iflyble = iflyble;
        this.ieatable = ieatable;
    }

    public Duck(iFlyble iflyble) {
        this.iflyble = iflyble;
    }

    private Duck(){
    }

    @Override
    public void fly() {
        iflyble.fly();
    }


    @Override
    public void eat() {
        ieatable.eat();
    }
}
