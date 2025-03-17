package com.sazakimaeda.patterns.factory.first;

import com.sazakimaeda.patterns.factory.first.each.PizzaCheese;
import com.sazakimaeda.patterns.factory.first.each.PizzaPepper;

public class PizzaFactory{
    private Pizza pizza;
    public Pizza gets (String name){
        if(name.equalsIgnoreCase("cheese")){
            return pizza = new PizzaCheese();
        } else if(name.equalsIgnoreCase("pepper")){
            return pizza = new PizzaPepper();
        } else {
            throw new RuntimeException("Unsupported pizza name: " + name);
        }
    }
}
