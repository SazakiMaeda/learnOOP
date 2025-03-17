package com.sazakimaeda.patterns.decorator.second;

import com.sazakimaeda.patterns.decorator.second.d.ChocalateDecorator;
import com.sazakimaeda.patterns.decorator.second.d.Decorator;
import com.sazakimaeda.patterns.decorator.second.d.KorizaDecorator;
import com.sazakimaeda.patterns.decorator.second.i.Bread;
import com.sazakimaeda.patterns.decorator.second.i.Position;

public class Start {
    public static void main(String[] args) {
        Decorator John = new KorizaDecorator(new Bread());
        System.out.println(John.cost());

        Decorator John2 = new ChocalateDecorator(John);
        System.out.println(John2.cost());
    }
}
