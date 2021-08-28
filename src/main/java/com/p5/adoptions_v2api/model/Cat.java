package com.p5.adoptions_v2api.model;

public class Cat extends Animal implements AnimalInterface{

    /**
     *Example of multiple inheritance
     */

    public static String staticField = "This is a static field";
    public Integer purrIntensity;


    public Cat(String name, String photo, Integer purrIntensity) {

//        Super is a mandatory if we have a constructor with parameters in base class
//        MUST BE ON THE FIRST LINE OF THE CHILD'S CONSTRUCTOR
        super(name, photo);
        customMethodToCast();
        this.purrIntensity = purrIntensity;
    }

    public Cat(String name, String photo) {
        super(name, photo);
    }

    //    Singleton simplified:

    private Cat() {

    }

    private static Cat instance;
    public static Cat getInstance()
    {
        if(instance == null)
        {
            instance = new Cat();
        }
        return instance;
    }
//
    @Override
    public String makeSound() {
       return "Miau";
    }

    @Override
    public String whatDoesItEats() {
        return "Milk";
    }

    @Override
    public String howManyLegs() {
        return "4";
    }

    //Second example of polymorphism
    public String customMethodToCast()
    {
        return "Cats are cool, only cats can do this";
    }

    public String customMethodToCast(String message)
    {
        return message;
    }
}
