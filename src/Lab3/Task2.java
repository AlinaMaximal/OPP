package Lab3;

import java.util.Scanner;

public class Task2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Гра Відгадай число!");
        System.out.print("Введіть число: ");
        int guess = scanner.nextInt();
        int randomNumber = 3;
        do {
            if (guess < randomNumber) {
                System.out.println("Спробуйте більше число!");
                guess = scanner.nextInt();
            } else if (guess > randomNumber) {
                System.out.println("Спробуйте менше число!");
                guess = scanner.nextInt();
            } else {
                System.out.println("Вітаємо! Вивгадали загадане число!!!");
            }
        } while (guess != randomNumber);

        System.out.println("Завершення програми!!!");
    }
}