public class Cat implements Pet {
    private final String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println("Mur-Mur...");
    }

    @Override
    public String getName() {
        return this.name;
    }
}
