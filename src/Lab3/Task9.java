package Lab3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введіть розмір масиву: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        System.out.println("Масив випадкових чисел:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        System.out.print("Введіть будь-який індекс елемента (від 0 до " + array.length + "): ");
        int index = scanner.nextInt();

        if (index >= 0 && index < array.length) {
            System.out.print("Введіть нове значення для елемента: ");
            int newValue = scanner.nextInt();

            array[index] = newValue;

            System.out.println("Оновлений масив: " + Arrays.toString(array));
        } else {
            System.out.println("Помилка: Індекс виходить за межі масиву!");
        }

        scanner.close();
    }

}

