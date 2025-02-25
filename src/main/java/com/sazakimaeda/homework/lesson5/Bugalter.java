package com.sazakimaeda.homework.lesson5;

public class Bugalter extends Human {

    public Bugalter(String name, String sex) {
        super(name, sex);
    }

    @Override
    public void getMoney() {
        int salary = 50_000;
        System.out.printf("Бухгалтер получает ЗП: %d\n", salary);
    }

    @Override
    public void drinkCoffee() {
        System.out.println("Бухгалтер пьёт кофе.");
    }

    @Override
    public void skill() {
        System.out.println("Бухгалтер считает налоги.");
    }
}
