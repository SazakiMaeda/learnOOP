package com.sazakimaeda.lambda.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class lesson1 {
    private static int count = 0;

    public static void main(String[] args) {
        test5();
    }

    public static void test0() {
        List<String> list = List.of("яблоко", "молоко", "печень", "яблоко", "масло");
        // Либо так
        list.forEach(i ->{
            if (i.equals("яблоко")) {
                count++;
                System.out.println(count + " " + i);
            }
        });
        // Либо так
        Long stream = list.stream().filter(e -> e.equals("яблоко")).count();
        System.out.println(stream);
    }
    public static void test1() {
//1. Напишите программу на Java для реализации лямбда-выражения для нахождения суммы двух целых чисел.
        List<Integer> list = List.of(1, 2);
        System.out.println(list.stream().reduce((a, b) -> a + b).get());
    }
    public static void test2() {
// 2. Напишите программу на Java, реализующую лямбда-выражение для проверки, является ли заданная строка пустой.
        List<String> list = List.of("", "ne");
        list.stream().map(i -> i.isEmpty())
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
    public static void test3() {
// 7. Напишите программу на Java для реализации лямбда-выражения для удаления дубликатов из списка целых чисел.
        List<Integer> list = List.of(1, 2, 3, 4, 5, 1, 2, 5, 0);
        list.stream().distinct().forEach(System.out::println);
    }
    public static void test4() {
//1. Напишите программу на Java для вычисления среднего значения списка целых чисел с помощью потоков.
        List<Integer> list = List.of(1, 2, 3, 4, 5, 1, 2, 5, 0);
        list.stream().mapToInt(Integer::intValue).average().ifPresent(System.out::println);
    }
    public static void test5() {

    }
}
