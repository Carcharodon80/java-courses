package com.petclinic;

public class Client {
    private String NameClient;
    private Pet pet;

    Client(String nameClient, Pet pet) {
        NameClient = nameClient;
        this.pet = pet;
    }

    String getNameClient() {
        return NameClient;
    }

    Pet getPet() {
        return pet;
    }

    void setNameClient(String nameClient) {
        NameClient = nameClient;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
