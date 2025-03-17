package com.sazakimaeda.lambda.stream;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        ArrayList<Students> student = new ArrayList<>();
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


        student.stream().map(element ->
        {
            element.getName().toUpperCase();
            return element;
        }).filter(element -> element.getSex() == "M")
                .sorted((a, b) -> a.getAge()-b.getAge())
                .forEach(System.out::println);


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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
