package com.sazakimaeda.homework.lesson6;

import com.sazakimaeda.homework.lesson6.intefaces.Flyeble;
import com.sazakimaeda.homework.lesson6.intefaces.Swimable;

import java.util.ArrayList;

public class Start {
    public static void main(String[] args) {
        Duck duck = new Duck();
        ArrayList<Swimable> swimables = new ArrayList<>();
        swimables.add(new Fish());
        swimables.add(duck);
        for(Swimable swimable : swimables) {
            swimable.swim();
        }

        ArrayList<Flyeble> flyebles = new ArrayList<>();
        flyebles.add(duck);
        flyebles.add(new Airplane());
        for(Flyeble flyeble : flyebles) {
            flyeble.fly();
        }

    }
}
