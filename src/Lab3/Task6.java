package Lab3;

import java.util.Random;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Скільки чисел в масиві? ");
        int size = sc.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1;
        }

        System.out.println("\nОсь твій масив:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        int min = array[0];
        int max = array[0];
        int sum = 0;
        int evenCount = 0;

        for (int num : array) {
            if (num < min) min = num;
            if (num > max) max = num;
            sum += num;
            if (num % 2 == 0) evenCount++;
        }

        double average = (double) sum / array.length;

        System.out.println("\n\n--- Результати ---");
        System.out.println("Найменше число: " + min);
        System.out.println("Найбільше число: " + max);
        System.out.println("Середнє значення: " + average);
        System.out.println("Кількість парних чисел: " + evenCount);
    }
}
