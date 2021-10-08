package com.company;

public class Constable extends Role{

    private boolean jurisdiction;

    public Constable(String name) {
        super(name);
        System.out.println("**** created a Constable named: " + name);
        this.setStrength(60);
        this.setHealth(100);
        this.setStamina(60);
        this.setSpeed(20);
        this.setAttackPower(5);
        this.jurisdiction = true;
    }

    protected void arrest() {
        System.out.println("**** starting METHOD: arrest. Stamina: " + getStamina());
        decreaseStamina();
        System.out.println("**** ending METHOD: arrest. Stamina: " + getStamina());

    }

    protected void heal() {
        this.setStrength(60);
        this.setHealth(100);
        this.setStamina(60);
        this.setSpeed(20);
        this.setAttackPower(5);
        System.out.println("**** Constable's attributes have been restored ");
    }
}