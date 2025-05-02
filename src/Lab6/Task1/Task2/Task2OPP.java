package Lab6.Task1.Task2;

import java.util.Scanner;

public class Task2OPP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Car car = new Car();

        System.out.print("Mаркa авто: ");
        car.mark = scanner.nextLine();
        System.out.print("Модель авто: ");
        car.model = scanner.nextLine();
        System.out.print("Швидкість авто: ");
        car.speed = scanner.nextLine();
        car.Info();
        System.out.println("На скільки прискорити:");
        car.speed1 = scanner.nextInt();
        car.speed_speed1();
    }
}

