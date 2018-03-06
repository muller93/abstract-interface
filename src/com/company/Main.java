package com.company;

public class Main {

    public static void main(String[] args) {

    Chicken chik1 = new Chicken("Kiskakas");
    Chicken chik2 = new Chicken("Kakas");
    Chicken chik3 = new Chicken("Csirip");
    Chicken chik4 = new Chicken("Raptor");
    Chicken chik5 = new Chicken("Csiripke");
    Animal[] animals = new Animal[]{chik1,chik2,chik3,chik4,chik5};

    for (int i = 0; i < animals.length; i++){
        System.out.println(animals[i].getClass());
        }
    }
}
