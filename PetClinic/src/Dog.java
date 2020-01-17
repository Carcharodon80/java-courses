public class Dog implements Pet {
    private String name;

    Dog(String name) {
        this.name = name;
    }


    @Override
    public void makeSound() {
        System.out.println("Gav-Gav!");
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
