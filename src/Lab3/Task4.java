package Lab3;

import java.util.Scanner;

class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введіть число: ");
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.print("Сума всіх чисел від 1 до " + n + " дорівнює: " + sum);

        sc.close();

    }
}