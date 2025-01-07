package com.sazakimaeda.homework.lesson2;

public class Enemy implements Mortal{
    private String name;
    private int health;
    private int damege;

    public Enemy(String name, int health, int damege) {
        this.name = name;
        this.health = health;
        this.damege = damege;
    }

    public int getDamege() { return damege; }
    public String getName() { return name; }
    public int getHealth() { return health; }
    public void setHealth(int health) { this.health = health; }

    public void takeDamage(int damage) {
        this.health -= Math.min(damage, health);
        System.out.println(name + " получил урон " + damage+ ". Осталось " + health);
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }
}
