package com.sazakimaeda.homework.lesson6;

import com.sazakimaeda.homework.lesson6.intefaces.Swimable;

public class Fish implements Swimable {

    @Override
    public void swim() {
        System.out.println("Рыба умеет плавать");
    }
}
