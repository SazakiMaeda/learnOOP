package com.sazakimaeda.patterns.observ.second;

import com.sazakimaeda.patterns.observ.second.i.Observed;
import com.sazakimaeda.patterns.observ.second.i.Observer;

import java.util.ArrayList;
import java.util.List;

public class MeteoStation implements Observed {
    List<Observer> observers = new ArrayList<>();

    @Override
    public void add(Observer observer) {
        this.observers.add(observer);
        notifyObservers();
    }

    @Override
    public void remove(Observer observer) {
        this.observers.remove(observer);
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        observers.forEach(Observer::update);
    }
}
