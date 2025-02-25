package com.sazakimaeda.oop;

public class telephone extends Computer {
    private int weight;

    public telephone(Ssd ssd, Ram ram, int weight) {
        super(ssd, ram);
        this.weight = weight;
    }

    public void open() {
        System.out.println("Открыл крышку.");
    }

    public int getWeight() {
        return weight;
    }
}
