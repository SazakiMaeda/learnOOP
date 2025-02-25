package com.sazakimaeda.homework.lesson1;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() { return x; }
    public void setX(int x) { this.x = x; }

    public int getY() { return y; }
    public void setY(int y) { this.y = y;}


    public static void distance() {
        Point p1 = new Point(133, 24);
        int D = p1.getX() - p1.getY();
        System.out.println(D + " метров.");
    }

    public static void main(String[] args) {
        distance();
    }
}
