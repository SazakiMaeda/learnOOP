package com.sazakimaeda.patterns.decorator.first;

import com.sazakimaeda.patterns.decorator.first.dec.Decorator;
import com.sazakimaeda.patterns.decorator.first.dec.CaramelDecorator;
import com.sazakimaeda.patterns.decorator.first.dec.ChocalateDecorator;
import com.sazakimaeda.patterns.decorator.first.dr.Latte;

public class Start {
    public static void main(String[] args) {
        Decorator caramelDecorator = new CaramelDecorator(new Latte());

        Decorator john = new ChocalateDecorator(new CaramelDecorator(new Latte()));
        System.out.println(john.cost());
    }
}
