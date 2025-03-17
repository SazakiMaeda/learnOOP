package com.sazakimaeda.lambda.homework;

import java.util.function.Consumer;
import java.util.List;

public class Homework2 {
    public static void main(String[] args) {
        Consumer<String> test = (name) -> System.out.println("hello " + name);
        test.accept("world");

        List<Integer> test2 = List.of(1, 2, 3, 4, 5);
        test2.forEach(s -> {
                    s++;
                    System.out.println(s);
                }

        );
    }
}
