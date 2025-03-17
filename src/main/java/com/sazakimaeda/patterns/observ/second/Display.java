package com.sazakimaeda.patterns.observ.second;

import com.sazakimaeda.patterns.observ.second.i.Observer;

public class Display implements Observer {
    private String name;

    private Display() {
    }

    public Display(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println(name + " подписался на новости погоды");
    }
}
