package com.sazakimaeda.lombok;

import lombok.*;

@Getter
@Setter
@ToString
public class Test implements Comparable <Test>{
    private int age;
    private String name;

    @Override
    public int compareTo(Test o) {
        return 0;
    }
}

class abs {
    public static void main(String[] args) {
//        Test test = new Test(0, "");
//        System.out.println(test);

        Test test1 = new Test();
        System.out.println(test1);
    }
}
