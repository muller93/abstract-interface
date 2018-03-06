package com.company;

public abstract class ContinentalAnimal extends Animal{
    public ContinentalAnimal(String name) {
        super(name);
    }

    private int numberOfLegs;

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }
}
