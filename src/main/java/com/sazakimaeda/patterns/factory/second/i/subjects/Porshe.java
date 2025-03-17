package com.sazakimaeda.patterns.factory.second.i.subjects;

import com.sazakimaeda.patterns.factory.second.i.Cars;

public class Porshe implements Cars {
    @Override
    public void info() {
        System.out.println("Im porshe");
    }

    @Override
    public double cost() {
        return 10000;
    }
}
