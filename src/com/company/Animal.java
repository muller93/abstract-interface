package com.company;

public abstract class Animal {
    private String name;
    private int fullness;
    private int power;

    public Animal(String name) {
        this.name = name;
        this.fullness = 100;
        this.power = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFullness() {
        return fullness;
    }

    public void setFullness(int fullness) {
        this.fullness = fullness;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
    public abstract String makesSound();
}
