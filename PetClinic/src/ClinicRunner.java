public class ClinicRunner {
    public static void main(String[] args) {
        Clinic clinic = new Clinic(new Client[10]);

        Client client = new Client("John", new Dog("Barbos"));
        clinic.addClient(client);

        View view = new View(clinic);
    }
}
