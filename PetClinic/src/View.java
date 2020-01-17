import java.util.Scanner;

/**
 * Класс ввода комманд и вывод информации на консоль
 */
class View {
    private final Clinic clinic;

    View(Clinic clinic) {
        this.clinic = clinic;
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

        switch (command) {
            case "1":
                this.showClients();
                break;
            case "2":
                clinic.addClient(this.requireNewClient());
                break;
            case "3":
                clinic.findClient(this.requireExistClient());
                break;
            case "4":
                clinic.findPet(this.requireExistPet());
                break;
            case "5":
                clinic.editClient(this.requireNumberOfExistClient());
                break;
            case "6":
                clinic.deleteClient(this.requireNumberOfExistClient());
                break;
            case "7":
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
        return new Client(nameClient, pet);
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
        return scanner.next();
    }

    /**
     * метод запрашивает с консоли имя клиента
     * @return String имя клиента
     */
    private String requireExistClient() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя клиента: ");
        return scanner.next();
    }

    /**
     * метод запрашивает с консоли имя питомца
     * @return String имя питомца
     */
    private String requireExistPet() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя питомца: ");
        return scanner.next();
    }

    private int requireNumberOfExistClient() {
        System.out.println("Введите номер клиента в базе: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    /**
     * метод выводит клиентов и их питомцев на консоль, сообщает, если клиника пуста
     */
    private void showClients() {
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
