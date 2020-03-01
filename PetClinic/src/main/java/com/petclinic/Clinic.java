package com.petclinic;

import java.util.List;
import java.util.Scanner;

class Clinic {
    private final List<Client> clients;

    Clinic(List<Client> clients) {
        this.clients = clients;
    }

    /**
     * добавляет клиента в лист клиники
     *
     * @param client новый клиент клиники
     */
    void addClient(Client client) {
        clients.add(client);
    }

    /**
     * проверяет, пуста ли клиника
     *
     * @return true, если клиника пуста
     */
    boolean clinicIsEmpty() {

        return clients.isEmpty();
    }

    /**
     * метод находит клиента по его имени и выводит на экран
     *
     * @param nameClient имя клиента
     */
    void findClient(String nameClient) {
        boolean hasClientInClinic = false;
        for (Client client : clients) {
            if (client != null && client.getNameClient().equals(nameClient)) {
                System.out.println("Указанный клиент есть в базе:");
                System.out.println("Имя клиента : " + client.getNameClient() + ", " +
                        client.getPet().getClass().getSimpleName() + " : " + client.getPet().getName());
                System.out.println();
                hasClientInClinic = true;
            }
        }
        if (!hasClientInClinic) {
            System.out.println("Указанного клиента нет в клинике.");
            System.out.println();
        }
    }

    /**
     * метод находит питомца по его имени и выводит на экран
     *
     * @param namePet имя питомца
     */
    void findPet(String namePet) {
        boolean hasPetInClinic = false;
        for (Client client : clients) {
            if (client != null && client.getPet().getName().equals(namePet)) {
                System.out.println("Указанный питомец есть в базе: ");
                System.out.println("Имя клиента : " + client.getNameClient() + ", " +
                        client.getPet().getClass().getSimpleName() + " : " + client.getPet().getName());
                System.out.println();
                hasPetInClinic = true;
            }
        }
        if (!hasPetInClinic) {
            System.out.println("Указанного питомца нет в клинике.");
            System.out.println();
        }
    }

    /**
     * метод вводит новое имя клиента и питомца
     *
     * @param numberClient номер клиента в базе
     */
    void editClient(int numberClient) {
        if (clients.get(numberClient) != null) {
            Client client = clients.get(numberClient);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите новое имя клиента: ");
            client.setNameClient(scanner.next());
            System.out.println("Введите новое имя питомца: ");
            client.getPet().setName(scanner.next());
        } else {
            System.out.println("Введен неверный номер клиента.");
            System.out.println();
        }
    }

    /**
     * метод получает номер клиента и удаляет его из базы
     *
     * @param numberClient номер клиента в базе
     */
    void deleteClient(int numberClient) {
        System.out.println("Клиент " + clients.get(numberClient).getNameClient() + " удален из базы.");
        System.out.println();
        clients.remove(numberClient);
    }

    /**
     * заканчивает работу с программой
     */
    void exit() {
        System.exit(0);
    }

    /**
     * геттер базы клиентов
     *
     * @return массив клиентов
     */
    List<Client> getClients() {
        return clients;
    }
}
