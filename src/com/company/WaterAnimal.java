package com.company;

public abstract class WaterAnimal extends Animal{
    public WaterAnimal(String name) {
        super(name);
    }

    @Override
    public String makesSound() {
        return "nem hallható a víz alatt";
    }
}
