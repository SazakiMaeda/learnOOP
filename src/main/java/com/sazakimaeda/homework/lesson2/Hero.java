package com.sazakimaeda.homework.lesson2;

public abstract class Hero {
    private final String name;
    private final int damage;
    private final int hp;

    public Hero(String name, int damage, int hp) {
        this.name = name;
        this.damage = damage;
        this.hp = hp;
    }

    public abstract void attackEnemy(Enemy enemy);
    public abstract void takeDamage(int damage);

    public String getName() { return name; }
    public int getDamage() { return damage; }
    public int getHp() { return hp; }
    public int setHp(int hp) { return hp; }
}
