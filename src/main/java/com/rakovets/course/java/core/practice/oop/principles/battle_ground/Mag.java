package com.rakovets.course.java.core.practice.oop.principles.battle_ground;

public class Mag extends Hero {
    private int health;

    public Mag(String name, int health) {
        super(name, health);
        this.health = health;
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(70);
    }

    public int addHealth() {
        if (this.health < 100) {
            return Math.abs(this.health * 2);
        } else {
            return this.health;
        }
    }
}