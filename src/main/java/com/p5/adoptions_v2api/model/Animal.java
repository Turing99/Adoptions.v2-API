package com.p5.adoptions_v2api.model;


public class Animal extends AbstractAnimal implements AnimalInterface
{
    private String name;
    private String photo;

    public Animal(String name, String photo)
    {
        this.name = name;
        this.photo = photo;
    }

    public Animal()
    {
    }

    public String makeSound()
    {
        return "Nothing";
    }

    /**
     * Only visible in this class and in those that extend
     */
    protected String secondSound()
    {
        return "Nothing2";
    }


    @Override
    public String whatDoesItEats()
    {
        return "Unknown";
    }

    @Override
    public String howManyLegs()
    {
        return null;
    }


    // Getter and setters
    public String getName()
    {
        return name;
    }

    public Animal setName(String name)
    {
        this.name = name;
        return this;
    }

    public String getPhoto()
    {
        return photo;
    }

    public Animal setPhoto(String photo)
    {
        this.photo = photo;
        return this;
    }


}