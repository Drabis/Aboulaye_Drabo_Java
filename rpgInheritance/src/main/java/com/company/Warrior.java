package com.company;

import java.util.Objects;

public class Warrior extends Role{

    private int shieldStrength;

    public Warrior(String name) {
        super(name);
        System.out.println("**** created a Warrior named: " + name);
        this.setStrength(75);
        this.setHealth(100);
        this.setStamina(100);
        this.setSpeed(50);
        this.setAttackPower(10);
        this.shieldStrength = 100;
    }

    protected void decreaseShieldStrength(){
        this.shieldStrength -= 2;
        System.out.println("**** shield strength decreased");
    }

    protected void heal() {
        this.setStrength(75);
        this.setHealth(100);
        this.setStamina(100);
        this.setSpeed(50);
        this.setAttackPower(10);
        this.shieldStrength = 100;
        System.out.println("**** Warrior's attributes have been restored ");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Warrior warrior = (Warrior) o;
        return shieldStrength == warrior.shieldStrength;
    }

    @Override
    public int hashCode() {
        return Objects.hash(shieldStrength);
    }

    @Override
    public void attack() {
        System.out.println("Warrior has attacked with damage of " + this.getAttackPower());
    }
}
