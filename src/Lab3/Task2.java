package Lab3;

import java.util.Random;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secretNumber = 7;
        int userGuess = 0;

        System.out.print("Вгадайте число");
        do {
            System.out.print("Введіть число: ");
            userGuess = scanner.nextInt();

            if (userGuess < secretNumber) {
                System.out.println("Спробуйте більше число!");
            } else if (userGuess > secretNumber) {
                System.out.println("Спробуйте менше число!");
            } else {
                System.out.println("Вітаємо! Ви вгадали число!");
            }
        } while (userGuess != secretNumber);

        scanner.close();
    }
}