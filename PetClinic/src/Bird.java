public class Bird implements Pet{
    private final String name;

    public Bird(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println("Co-co-co!!!");
    }

    @Override
    public String getName() {
        return this.name;
    }
}
