package com.company;

import java.util.Objects;

public class Farmer extends Role{


    public Farmer(String name) {
        super(name);
        System.out.println("**** created a FARMER named: " + name);
        this.setStrength(75);
        this.setHealth(100);
        this.setStamina(75);
        this.setSpeed(10);
        this.setAttackPower(1);
    }

    protected void plow() {
        decreaseStamina();
        System.out.println("**** METHOD: plow. Stamina: " + getStamina());
    }

    protected void harvest() {
        decreaseStamina();
        System.out.println("**** METHOD: harvest. Stamina: " + getStamina());
    }
    protected void heal() {
        this.setStrength(75);
        this.setHealth(100);
        this.setStamina(75);
        this.setSpeed(10);
        this.setAttackPower(1);
        System.out.println("**** Farmer's attributes have been restored ");
    }



}

