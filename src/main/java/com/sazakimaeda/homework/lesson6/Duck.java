package com.sazakimaeda.homework.lesson6;

import com.sazakimaeda.homework.lesson6.intefaces.Flyeble;
import com.sazakimaeda.homework.lesson6.intefaces.Swimable;

public class Duck implements Flyeble, Swimable {

    @Override
    public void swim() {
        System.out.println("Утка плавает");
    }

    @Override
    public void fly() {
        System.out.println("Утка летает");
    }
}
