package com.sazakimaeda.patterns.observ.first;

import com.sazakimaeda.patterns.observ.first.i.observed;
import com.sazakimaeda.patterns.observ.first.i.observer;

public class Start {
    public static void main(String[] args) {
        observed site = new Site();



        observer subject1 = new Subscriber("Anton");
        observer subject2 = new Subscriber("Alena");
        site.add(subject1);
        site.add(subject2);

    }
}
