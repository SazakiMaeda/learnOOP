package com.sazakimaeda.homework.lesson3;

public class Start {
    public static void main(String[] args) {
        Task1 bookStart = new Task1("loh", "pidr", 20);
        System.out.println(bookStart.howManyPages());
        System.out.println(bookStart.many(2));

        System.out.printf("%s %s", bookStart.getNameBook(), bookStart.getAuthor());
    }
}
