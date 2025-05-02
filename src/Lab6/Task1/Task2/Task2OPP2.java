package Lab6.Task1.Task2;

import java.util.Scanner;

public class Task2OPP2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String mark;
        String model;
        int speed;
        int speed1;

        System.out.print("Mаркa авто: ");
        mark = scanner.nextLine();
        System.out.print("Модель авто: ");
        model = scanner.nextLine();
        System.out.print("Швидкість авто: ");
        speed = scanner.nextInt();
        System.out.println("На скільки прискорити:");
        speed1 = scanner.nextInt();
        speed_speed1(speed,speed1);
}
    public static void speed_speed1(int speed, int speed1) {
        speed += speed1;
        System.out.println("Нова швидкість: "+speed);
    }
    public static void Info(String mark, String model, int speed) {
        System.out.println("Mарка: " + mark  + ",Модель:" +  model + ",Швидкість"+ speed);

    }
}
