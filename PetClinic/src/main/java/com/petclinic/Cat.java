package com.petclinic;

public class Cat implements Pet {
    private String name;

    Cat(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println("Mur-Mur...");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
