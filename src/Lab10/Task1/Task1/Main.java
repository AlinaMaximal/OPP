package Lab10.Task1.Task1;


public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound();
        cat.makeSound();

        dog.sleep();
        cat.sleep();
    }
}
