package com.sazakimaeda.generics;

public class ListRunner {
    public static void main(String[] args) {
        List<String> list = new List<>(10);
        list.add("String1");
        list.add("String2");

        Object element = list.get(1);
        System.out.println(element);
    }
}
