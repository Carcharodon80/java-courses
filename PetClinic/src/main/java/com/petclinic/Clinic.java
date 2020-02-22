package com.petclinic;

import java.util.Scanner;

class Clinic {
    private final Client[] clients;

    Clinic(Client[] clients) {
        this.clients = clients;
    }

    /**
     * добавляет клиента в массив клиники, если есть свободные места
     * @param client новый клиент клиники
     */
    void addClient(Client client){
        if (clinicIsFull()) {
            try {
                throw new UserException("Извините, клиника переполнена");
            } catch (UserException e) {
                System.out.println("Приходите позже...");
            }
        } else {
            for (int i = 0; i < clients.length; i++) {
                if (clients[i] == null) {
                    clients[i] = client;
                    break;
                }
            }
        }
    }

    /**
     * проверяет, пуста ли клиника
     * @return true, если клиника пуста
     */
    boolean clinicIsEmpty() {
        boolean clinicIsEmpty = true;
        for (Client client : clients) {
            if (client != null) {
                clinicIsEmpty = false;
            }
        }
        return clinicIsEmpty;
    }

    /**
     * проверяет, переполнена ли клиника
     * @return true, если нет свободных мест
     */
    private boolean clinicIsFull() {
        boolean clinicIsFull = true;
        for (Client client : clients) {
            if (client == null) {
                clinicIsFull = false;
            }
        }
        return clinicIsFull;
    }

    /**
     * метод находит клиента по его имени и выводит на экран
     * @param nameClient имя клиента
     */
    void findClient(String nameClient) {
        boolean hasClientInClinic = false;
        for (Client client : clients){
            if (client != null && client.getNameClient().equals(nameClient)){
                System.out.println("Указанный клиент есть в базе:");
                System.out.println("Имя клиента : " + client.getNameClient() + ", " +
                        client.getPet().getClass().getName() + " : " + client.getPet().getName());
                System.out.println();
                hasClientInClinic = true;
            }
        }
        if (!hasClientInClinic){
            System.out.println("Указанного клиента нет в клинике.");
            System.out.println();
        }
    }

    /**
     * метод находит питомца по его имени и выводит на экран
     * @param namePet имя питомца
     */
    void findPet(String namePet) {
        boolean hasPetInClinic = false;
        for (Client client : clients){
            if (client != null && client.getPet().getName().equals(namePet)){
                System.out.println("Указанный питомец есть в базе: ");
                System.out.println("Имя клиента : " + client.getNameClient() + ", " +
                        client.getPet().getClass().getName() + " : " + client.getPet().getName());
                System.out.println();
                hasPetInClinic = true;
            }
        }
        if (!hasPetInClinic){
            System.out.println("Указанного питомца нет в клинике.");
            System.out.println();
        }
    }

    /**
     * метод вводит новое имя клиента и питомца
     * @param numberClient номер клиента в базе
     */
    void editClient(int numberClient) {
        if (clients[numberClient] != null){
            Client client = clients[numberClient];
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите новое имя клиента: ");
            client.setNameClient(scanner.next());
            System.out.println("Введите новое имя питомца: ");
            client.getPet().setName(scanner.next());
        }
        else {
            System.out.println("Введен неверный номер клиента.");
            System.out.println();
        }
    }

    /**
     * метод получает номер клиента и удаляет его из базы
     * @param numberClient номер клиента в базе
     */
    void deleteClient(int numberClient) {
        System.out.println("Клиент " + clients[numberClient].getNameClient() + " удален из базы.");
        System.out.println();
        clients[numberClient] = null;
    }

    /**
     * заканчивает работу с программой
     */
    void exit(){
        System.exit(0);
    }

    /**
     * геттер базы клиентов
     * @return массив клиентов
     */
    Client[] getClients() {
        return clients;
    }
}
