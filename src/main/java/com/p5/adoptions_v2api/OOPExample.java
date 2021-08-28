package com.p5.adoptions_v2api;

import com.p5.adoptions_v2api.model.Animal;
import com.p5.adoptions_v2api.model.Cat;
import com.p5.adoptions_v2api.model.Dog;

import static com.p5.adoptions_v2api.model.Cat.staticField;

/**
 * OOP Principles:
 * 1. Abstraction:  Model real life scenarios/objects into java classes and objects.
 * 2. Encapsulation:  Hide info about classes, allow access through getter and setters
 * 3. Inheritance: Define a parent class to be extended later.
 * 4. Polymorphism: Something that can have multiple forms
 */

public class OOPExample {

    public static void main(String[] args) {

        //First example of Polymorphism

        // left: interface/abstract class; right: the implementation
        Animal animal = new Dog("Rex", "www.google.com");
        System.out.println(animal.makeSound());

        animal = new Cat("Machi", "www.google.com", 6);
        System.out.println(animal.makeSound());

//        Make sure that we have a cat
        if(animal instanceof Cat)
        {
            //Cast syntax
            Cat thisIsACat = (Cat) animal;
            System.out.println(thisIsACat.customMethodToCast());
        }

//        Static example
        Cat cat = new Cat("Miti", "www.google.com", 4);
        int purrIntensity= cat.purrIntensity;
        String staticField = Cat.staticField;


    }
}
