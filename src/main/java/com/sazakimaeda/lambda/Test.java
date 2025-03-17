package com.sazakimaeda.lambda;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Test {
    private static ArrayList<Students> student = new ArrayList<>();

    void allInfo(ArrayList<Students> st, Checker ch) {
        for (Students s : st) {
            if (ch.isChecker(s)) {
                System.out.println(s);
            }
        }
    }

    public static void main(String[] args) {
        Students student1 = new Students("Anton", "M", 24, 9.9);
        Students student2 = new Students("Igor", "M", 32, 7.2);
        Students student3 = new Students("Mariya", "F", 17, 5.4);
        Students student4 = new Students("Kaya", "F", 25, 1.6);
        Students student5 = new Students("John", "M", 21, 3.2);
        student.add(student1);
        student.add(student2);
        student.add(student3);
        student.add(student4);
        student.add(student5);
        Test test = new Test();
//        test.infoAge(student, 25);
//        System.out.println("================");
//        test.infoScore(student,9);
//        System.out.println("================");
//        test.infoMix(student, "M", 16, 2);
        test.allInfo(student, (Students s) -> {
            return s.age >= 25;
        });

        System.out.println("================");
        test.allInfo(student, (Students s) -> {
            return s.score >= 6;
        });

        System.out.println("================");
        test.allInfo(student, (Students s) -> {
            return s.score >= 6 && s.sex == "M" && s.age >= 25;
        });
    }

    void infoAge(ArrayList<Students> st, int age) {
        for (Students s : st) {
            if (s.age >= age) {
                System.out.println(s);
            }
        }
    }
    void infoScore(ArrayList<Students> st, int score) {
        for (Students s : st) {
            if (s.score >= score) {
                System.out.println(s);
            }
        }
    }
    void infoMix(ArrayList<Students> st, String sex, int age, int score) {
        for (Students s : st) {
            if (s.sex == sex && s.age >= age && s.score >= score) {
                System.out.println(s);
            }
        }
    }
}

interface Checker {
    boolean isChecker(Students s);
}

class CheckerAge implements Checker {
    @Override
    public boolean isChecker(Students s) {
        return s.age >= 25;
    }
}
class CheckerScore implements Checker {
    @Override
    public boolean isChecker(Students s) {
        return s.score >= 6;
    }
}
class CheckerMix implements Checker {
    @Override
    public boolean isChecker(Students s) {
        return s.score >= 6 && s.sex == "M" && s.age >= 25;
    }
}
class Students {
    String name;
    String sex;
    int age;
    double score;

    public Students(String name, String sex, int age, double score) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Students{" +
               "name='" + name + '\'' +
               ", sex='" + sex + '\'' +
               ", age=" + age +
               ", score=" + score +
               '}';
    }
}

