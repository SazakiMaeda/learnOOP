package com.sazakimaeda;

public class Start {
    public static void main(String[] args) {
        Ram ram = new Ram(23);
        Ssd ssd = new Ssd(42);
        Computer computer = new Computer(ssd, ram);
        computer.load();


        telephone t = new telephone(new Ssd(32), new Ram(332), 23);
        System.out.println("=====");
        t.open();
        t.load();
    }
}
