package com.sazakimaeda.patterns.factory.second.i.subjects;

import com.sazakimaeda.patterns.factory.second.i.Cars;

public class Moskwich implements Cars {

    @Override
    public void info() {
        System.out.println("Im Moscwich");
    }

    @Override
    public double cost() {
        return 20000;
    }
}
