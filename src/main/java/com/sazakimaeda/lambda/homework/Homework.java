package com.sazakimaeda.lambda.homework;

import java.util.Random;
import java.util.function.Supplier;

public class Homework {
    public static void main(String[] args) {
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int number = rand.nextInt(100);
            Supplier<Integer> supplier = () -> number;
            System.out.println(i + 1 + " = " + supplier.get());
        }
    }
}
