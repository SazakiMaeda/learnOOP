package com.sazakimaeda.patterns.observ.second.i;

public interface Observed {
    void add(Observer observer);
    void remove(Observer observer);
    void notifyObservers();
}
