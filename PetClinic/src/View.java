import java.util.Scanner;

/**
 * Класс ввода комманд и вывод информации на консоль
 */
public class View {
    private final Clinic clinic;

    public View(Clinic clinic) {
        this.clinic = clinic;
        this.require();
    }

    /**
     * Главное меню: запрос функций программы
     */
    void require() {
        System.out.println("Выберите, что Вы хотите сделать:");
        System.out.println("1 : показать клиентов клиники.");
        System.out.println("2 : добавить нового клиента клиники.");
        System.out.println("3 : найти клиента.");
        System.out.println("4 : найти питомца.");
        System.out.println("5 : изменть данные клиента.");
        System.out.println("6 : удалить клиента.");
        System.out.println("7 : выход.");


        Scanner scanner = new Scanner(System.in);
        String command = scanner.next();

        if (command.equals("1")) {
            this.showClients();
            require();
        } else if (command.equals("2")) {
            clinic.addClient(this.requireNewClient());
            require();
        } else if (command.equals("7")) {
            clinic.exit();
        }
    }

    /**
     * Запрашивает нового клиента, его питомца
     * @return Client
     */
    private Client requireNewClient() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя клиента: ");
        String nameClient = scanner.next();
        Pet pet = this.requireNewPet();
        Client client = new Client(nameClient, pet);
        return client;
    }

    /**
     * Запрашивает нового питомца
     * @return Pet
     */
    private Pet requireNewPet() {
        int typePet = requireTypePet();
        String namePet = this.requireNamePet();
        Pet pet;
        if (typePet==1) {
            pet = new Dog(namePet);
        } else if (typePet==2) {
            pet = new Cat(namePet);
        } else {
            pet = new Bird(namePet);
        }
        return pet;
    }

    /**
     * Запрашивает тип питомца
     * @return typePet - 1, 2 или 3
     */
    private int requireTypePet() {
        int typePet;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Введите вид питомца: ");
            System.out.println("1 : собака.");
            System.out.println("2 : кошка.");
            System.out.println("3 : птица.");
            typePet = Integer.valueOf(scanner.next());
        }
        while (typePet != 1 && typePet != 2 && typePet != 3);
        return typePet;
    }

    /**
     * Запрашивает имя питомца
     * @return String
     */
    private String requireNamePet() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя питомца: ");
        String namePet = scanner.next();
        return namePet;
    }


    /**
     * метод выводит клиентов и их питомцев на консоль, сообщает, если клиника пуста
     */
    void showClients() {
        if (clinic.clinicIsEmpty()) {
            System.out.println("Клиника пуста.");
        } else {

            for (int i = 0; i < clinic.getClients().length; i++) {
                if (clinic.getClients()[i] != null) {
                    System.out.println(i + " : Client = " + clinic.getClients()[i].getNameClient() + ", " +
                            clinic.getClients()[i].getPet().getClass().getName() + " = " +
                            clinic.getClients()[i].getPet().getName());
                    System.out.println("----------------------------");
                }
            }
        }

    }


}
