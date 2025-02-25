package com.sazakimaeda.homework.lesson5;

public abstract class Human {
    private String name;
    private String sex;
    public static int count = 0;

    public Human(String name, String sex) {
        this.name = name;
        this.sex = sex;
        System.out.printf("Имя человека: %s\nПол человека: %s\n", name, sex);
        System.out.println("==========");
        count++;
    };

    public abstract void getMoney ();
    public void drinkCoffee() { };
    public abstract void skill();
}
