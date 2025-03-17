package com.sazakimaeda.patterns.observ.first;

import com.sazakimaeda.patterns.observ.first.i.observed;
import com.sazakimaeda.patterns.observ.first.i.observer;

import java.util.ArrayList;
import java.util.List;

public class Site implements observed {
    List<observer> subscribers = new ArrayList<>();

    @Override
    public void add(observer sub) {
        this.subscribers.add(sub);
        notifyObserver();
    }

    @Override
    public void remove(observer sub) {
        this.subscribers.remove(sub);
        notifyObserver();
    }

    @Override
    public void notifyObserver() {
        subscribers.forEach(observer::update);
    }
}
