package com.sazakimaeda.homework.lesson5;

import java.util.ArrayList;
import java.util.List;

public class Start {
    public static void main(String[] args) {
        List<Human> humans = new ArrayList<>();
        humans.add(new Oxpannik("Anton", "male"));
        humans.add(new Oxpannik("Nikita", "male"));
        humans.add(new Bugalter("Alena", "female"));

        for(Human human : humans) {
            human.getMoney();
            human.drinkCoffee();
            human.skill();
            System.out.println("==========");
        }
        System.out.println(Human.count);
    }
}
