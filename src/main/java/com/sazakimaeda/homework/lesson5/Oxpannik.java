package com.sazakimaeda.homework.lesson5;

public class Oxpannik extends Human {
    public Oxpannik(String name, String sex) {
        super(name, sex);
    }

    @Override
    public void getMoney() {
        int salary = 15_000;
        System.out.printf("Охранник получает ЗП: %d\n", salary);
    }

    @Override
    public void skill() {
        System.out.println("Охранник сторожит.");
    }
}
