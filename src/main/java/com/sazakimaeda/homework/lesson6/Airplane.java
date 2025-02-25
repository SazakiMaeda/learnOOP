package com.sazakimaeda.homework.lesson6;

import com.sazakimaeda.homework.lesson6.intefaces.Flyeble;

public class Airplane implements Flyeble {

    @Override
    public void fly() {
        System.out.println("Самолёт летит");
    }
}
