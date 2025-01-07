package com.sazakimaeda.homework.lesson2;

public class Warrior extends Hero implements Mortal{

    public Warrior(String name, int damage, int hp) {
        super(name, damage, hp);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Воин " + getName() + " атакует " + enemy.getName());
        enemy.takeDamage(getDamage());
    }

    @Override
    public boolean isAlive() {
        return getHp() > 0;
    }

    @Override
    public void takeDamage(int damage) {
        int hp = this.getHp();
        hp -= Math.min(damage, getHp());
        this.setHp(hp);
        if (hp <= 0) {
            System.out.println("Герой умер");
        } else {
            System.out.println(getName() + " получил урон " + damage+ ". Осталось " + hp);
        }
    }
}
