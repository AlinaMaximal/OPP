package Lab8.Task1.Task3;

public class Dog extends Mammal {

    public Dog(String name) {
        super(name);
    }

    void makeSound() {
        System.out.println("Bark "+ name);
    }
}
