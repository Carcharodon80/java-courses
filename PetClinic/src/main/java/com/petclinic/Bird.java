package com.petclinic;

public class Bird implements Pet{
    private String name;

    Bird(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println("Co-co-co!!!");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
