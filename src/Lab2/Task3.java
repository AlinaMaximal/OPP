package Lab2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть два числа: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = Math.max(a, b);
        System.out.println("Максимальне число: " + (max));
}
}
