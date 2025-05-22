package Lab8.Task1.Task2;

public class Vehicle {
    protected int speed;

    public Vehicle(int speed) {
        this.speed = speed;
    }

    void showSpeed() {
        System.out.println("Поточна швидкість " + speed);
    }
}