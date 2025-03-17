package com.sazakimaeda.lambda;

import java.util.ArrayList;
import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class Test2 {
    private static ArrayList<Name> name = new ArrayList<Name>();

    public static void main(String[] args) {
        Name n1 = new Name("Anton", 24, "M");
        Name n2 = new Name("Alena", 23, "F");
        name.add(n1);
        name.add(n2);
        info(name, (Name n) -> {
            return n.age == 23;
        });

        text(n -> n > 2);

        System.out.println(name);
        name.removeIf(i -> i.age == 24);
        System.out.println(name);
    }


    public static void info(ArrayList<Name> name, Predicate<Name> filter) {
        for (Name n : name) {
            if (filter.test(n)) {
                System.out.println(n);
            }
        }
    }

    public static void text(IntPredicate n) {
        String s = "соси";
        int i = s.length();
        System.out.println(n.test(i));
    }
}

class Name {
    String name;
    int age;
    String sex;

    public Name(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Name{" +
               "name='" + name + '\'' +
               ", age=" + age +
               ", sex='" + sex + '\'' +
               '}';
    }
}
