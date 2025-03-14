package Lab1;

import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введіть довжину прямокутника: ");
        double num1 = scan.nextDouble();
        System.out.print("Введіть ширину прямокутника: ");
        double num2 = scan.nextDouble();
        System.out.println("Площа: " + num1 * num2 );

    }
}

