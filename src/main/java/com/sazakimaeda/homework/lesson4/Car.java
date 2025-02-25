package com.sazakimaeda.homework.lesson4;

public class Car {
    private String model;
    private int maxSpeed = 220;

    public Car(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public Car(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void gas() {
        int resout = 110 / (this.maxSpeed / 20);
        System.out.printf("Скорость разгона до 100км/ч : %d\n", resout);
    }

    public static void main(String[] args) {
        Car car = new Car("w", 44);
        Car car2 = new Car("wewew", 44);
        Garage garage = new Garage();
        car.gas();
    }
}

class Garage {
    public Garage() {
        System.out.println("Гараж пустой");
    }

    public Garage(Car car) {
        System.out.println("В гараже 1 стоит машина " + car.getModel());
    }

    public Garage(Car car, Car car2) {
        System.out.printf("В гараже 2 стоят машины: %s, %s\n", car.getModel(), car2.getModel());
    }
}
