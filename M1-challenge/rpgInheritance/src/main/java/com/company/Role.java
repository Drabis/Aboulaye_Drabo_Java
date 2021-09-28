package com.company;

public class Role {
    private String name;
    private int strength;
    private int health;
    private int stamina;
    private int speed;
    private int attackPower;

    public Role(String name){
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public void run(){
        System.out.println("**** starting method: RUNNING.");
        System.out.println("**** speed: " + this.speed);
        System.out.println("**** stamina: " + this.stamina);
        System.out.println("**** strength: " + this.strength);
        this.speed += 5;
        decreaseStamina();
        this.strength -= 1;
        System.out.println("**** finish method: RUNNING.");
        System.out.println("**** speed: " + this.speed);
        System.out.println("**** stamina: " + this.stamina);
        System.out.println("**** strength: " + this.strength);
    }

    public void attack(){
        System.out.println("**** ATTACKING");
        decreaseStamina();
        if(this.attackPower > 0) {
            this.attackPower -= 1;
        } else {
            System.out.println("Character needs to heal to re-gain attack power.");
        }

    }


    public void decreaseHealth(){
        System.out.println("**** HEALTH DECREASED");
        this.health -= 5;
    }
    public void increaseStamina(){
        System.out.println("**** stamina INCREASED");
        this.stamina += 3;
    }
    public void decreaseStamina(){
        System.out.println("**** STAMINA DECREASED");
        this.stamina -= 2;
    }
}

