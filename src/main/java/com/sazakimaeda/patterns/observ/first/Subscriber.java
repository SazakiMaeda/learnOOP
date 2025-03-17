package com.sazakimaeda.patterns.observ.first;

import com.sazakimaeda.patterns.observ.first.i.observer;

public class Subscriber implements observer {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    private Subscriber() {
    }

    @Override
    public void update() {
        System.out.println("Subscriber update " + name +
                           "\n======================= \n");
    }
}
