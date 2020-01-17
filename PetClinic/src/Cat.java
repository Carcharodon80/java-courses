public class Cat implements Pet {
    private String name;

    Cat(String name) {
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

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
