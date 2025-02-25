package com.sazakimaeda;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class NullVoid {
    public static void main(String[] args) {
        lesson2();
    }

    public static void lesson1 () {
        //Выбрать текст начиная с 11 символа до конца строки, перевести в нижний регистр,
        //разбить строку на массив по пробелу. Вывести на экран каждое слово из массива и длинну строки этого слова.

        String text = "My name in Giovanni Giorgio";
        String[] resout2 = text.substring(11).toLowerCase().split(" ");
        for (int i = 0; i < resout2.length; i++) {
            System.out.println(resout2[i]);
            System.out.println(resout2[i].length());
        }
    }

    public static void lesson2 () {
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
}
