package Lab7.Task1.Task5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Clock clock= new Clock();
        System.out.print("Введіть години:");
        clock.setHours(scanner.nextInt());
        System.out.println("Введіть хвилини:");
        clock.setMinutes(scanner.nextInt());
        System.out.println("Введіть секунди:");
        clock.setMinutes(scanner.nextInt());

clock.displayTime();
        System.out.println("На скільки годин,хвилин,секунд пройти вперед?");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            clock.tick();
        }
        clock.displayTime();
    }
}