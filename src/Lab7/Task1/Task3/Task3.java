package Lab7.Task1.Task3;

import Lab7.Task1.Task2.Book;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Car car = new Car();

        System.out.print("Введіть бренд:");
        car.setBrand(scanner.nextLine());
        System.out.print("Введіть модель:");
        car.setModel(scanner.nextLine());
        System.out.print("Введіть швидкість:");
        car.setSpeed(scanner.nextDouble());

        System.out.print("На яку швидкість прискорити:");
        car.accelerate(scanner.nextInt());

        System.out.print("На скільки зменшити:");
        car.brake(scanner.nextInt());

        System.out.println();
        System.out.println("Авто Бренд:" + car.getBrand() + "Модель:" + car.getModel() + "Швидкість:" + car.getSpeed());
    }
}

