package com.sazakimaeda.patterns.observ.first.i;

public interface observed {
    void add(observer sub);
    void remove(com.sazakimaeda.patterns.observ.first.i.observer sub);
    void notifyObserver();
}
