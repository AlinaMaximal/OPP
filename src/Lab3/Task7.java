package Lab3;

import java.util.Random;
import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1;
        }

        System.out.println("До сортування:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        Arrays.sort(array);

        System.out.println("\nПісля сортування:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
