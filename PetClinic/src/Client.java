public class Client {
    private final String NameClient;
    private final Pet pet;

    public Client(String nameClient, Pet pet) {
        NameClient = nameClient;
        this.pet = pet;
    }

    public String getNameClient() {
        return NameClient;
    }

    public Pet getPet() {
        return pet;
    }
}
