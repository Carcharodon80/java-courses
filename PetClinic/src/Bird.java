public class Bird implements Pet{
    private String name;

    Bird(String name) {
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

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
