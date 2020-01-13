public class Clinic {
    private final Client[] clients;

    public Clinic(Client[] clients) {
        this.clients = clients;
    }

    /**
     * добавляет клиента в массив клиники, если есть свободные места
     *
     * @param client новый клиент клиники
     */
    void addClient(Client client) {
        if (clinicIsFull()) {
            System.out.println("Извините, клиника переполнена.");
        } else {
            for (int i = 0; i < clients.length; i++) {
                if (clients[i] == null) {
                    clients[i] = client;
                    break;
                }
            }
        }
    }



    void exit(){
        System.exit(0);
    }

    /**
     * проверяет, пуста ли клиника
     *
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
    boolean clinicIsFull() {
        boolean clinicIsFull = true;
        for (Client client : clients) {
            if (client == null) {
                clinicIsFull = false;
            }
        }
        return clinicIsFull;
    }

    public Client[] getClients() {
        return clients;
    }
}
