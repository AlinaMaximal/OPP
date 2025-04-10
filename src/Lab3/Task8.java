package Lab3;

import java.util.Random;
import java.util.Scanner;

public class SearchNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1;
        }

        System.out.println("Масив:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        System.out.println("Яке число шукаєте?");

        int number = scanner.nextInt();

        boolean found = false;
        for (int num : array) {
            if (num == number) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Число " + number + " знайдено у масиві.");
        } else {
            System.out.println("Число " + number + " не знайдено.");
        }
    }
}

