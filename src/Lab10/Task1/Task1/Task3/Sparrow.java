package Lab10.Task1.Task1.Task3;

public class Sparrow extends Bird implements Flyable {
    @Override
    void makeSound(){
        System.out.println("Cirik");
    }

    @Override
    public void fly(){
        System.out.println("Sparrow is flying");
    }
}