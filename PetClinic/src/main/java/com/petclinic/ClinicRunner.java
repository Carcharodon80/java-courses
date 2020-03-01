package com.petclinic;

import java.util.ArrayList;

public class ClinicRunner {
    public static void main(String[] args) {
        Clinic clinic = new Clinic(new ArrayList<Client>());

        Client client = new Client("John", new Dog("Barbos"));
        clinic.addClient(client);

        View view = new View(clinic);
        while (true) {
            view.require();
        }
    }
}
