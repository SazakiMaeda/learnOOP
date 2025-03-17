package com.sazakimaeda;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class NullVoid {
    public static void main(String[] args) {
        start();
    }


    public static void lesson1() {
        //Выбрать текст начиная с 11 символа до конца строки, перевести в нижний регистр,
        //разбить строку на массив по пробелу. Вывести на экран каждое слово из массива и длинну строки этого слова.

        String text = "My name in Giovanni Giorgio";
        String[] resout2 = text.substring(11).toLowerCase().split(" ");
        for (int i = 0; i < resout2.length; i++) {
            System.out.println(resout2[i]);
            System.out.println(resout2[i].length());
        }
    }
    public static void lesson2() {
        //Привет, я менеджер салона Audi
        //У нас есть модель Q3 за 15000.00
        //Есть ли у неё автоматическая коробка передачи?
        //Да

        String carMark = "Audi";
        String carModel = "Q3";
        double price = 15_000.00;
        boolean hasAutomaticTransmission = true;
        System.out.printf("Приве, я менеджер салона %s\n", carMark);
        System.out.printf("У нас есть модель %s за %f\n", carModel, price);
        System.out.println("Есть ли у неё автоматическая коробка предачи?");
        System.out.printf(hasAutomaticTransmission ? "Да" : "Нет");
    }
    public static void lessonTest() {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(2);
        queue.offer(3);
        System.out.println(queue);
        System.out.println(queue.poll());
    }

    public static void start() {
        int value;
        Inner inner;
        System.out.println(inner = new Inner(12));
    }

    public static class Inner {
        int horsePower;

        public Inner(int horsePower) {
            this.horsePower = horsePower;
        }

        @Override
        public String toString() {
            return "Inner{" +
                   "horsePower=" + horsePower +
                   '}';
        }
    }
}


