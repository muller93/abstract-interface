package com.company;

public class Chicken extends ContinentalAnimal implements Herbivorous {

    public Chicken(String name) {
        super(name);
        setNumberOfLegs(2);
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + " full with corns");
        this.setFullness(100);
    }

    public void eat(Animal animal){
        System.out.println(this.getName() + " ate a " + animal.getName() + ".");
        this.setFullness(100);
    }

    /*public void rest(int howMany){
        System.out.println(this.getName() + " ate " + eat() + ".";

    }*/

    @Override
    public String makesSound() {
        return "tweet tweet";
    }
}
