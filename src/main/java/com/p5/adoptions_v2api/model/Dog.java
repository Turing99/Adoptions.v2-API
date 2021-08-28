package com.p5.adoptions_v2api.model;

public class Dog extends Animal implements AnimalInterface{

    public Dog(String name, String photo)
    {
        super(name, photo);
        secondSound();
    }

    @Override
    public String makeSound() {
        return "Ham";
    }

    @Override
    public String whatDoesItEats() {
        return "Bones";
    }
}
