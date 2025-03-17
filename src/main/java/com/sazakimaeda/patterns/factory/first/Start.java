package com.sazakimaeda.patterns.factory.first;

public class Start {
    public static void main(String[] args) {
        PizzaFactory factory = new PizzaFactory();
        Pizza cheese = factory.gets("cheese");
        Pizza peperoni = (factory.gets("Pepper"));
        cheese.bakery();
        System.out.println(cheese.cost());
        peperoni.bakery();
        System.out.println(peperoni.cost());
    }
}
