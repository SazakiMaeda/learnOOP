package com.sazakimaeda.homework.lesson2;

public class TrainingGround {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("Anton Warrior", 4, 10);
        Enemy enemy = new Enemy("Zombie", 10, 4);

        while (true) {
            if (warrior.isAlive()) {
                warrior.attackEnemy(enemy);
                warrior.takeDamage(enemy.getDamege());
            } else {
                break;
            }
        }
    }
}
