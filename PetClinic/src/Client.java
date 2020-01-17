public class Client {
    private String NameClient;
    private Pet pet;

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

    public void setNameClient(String nameClient) {
        NameClient = nameClient;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
