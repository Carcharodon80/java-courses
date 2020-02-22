package com.petclinic;

public class Dog implements Pet {
    private String name;

    Dog(String name) {
        this.name = name;
    }


    public void makeSound() {
        System.out.println("Gav-Gav!");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
