package Lab5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1,num2,result = 0;
        char operator;
        boolean validOperation = true;

            System.out.println("Перше число:");
        num1 = scanner.nextDouble();

        System.out.println("Введіть оператор: ");
        operator = scanner.next().charAt(0);

        System.out.println("Друге число:1");
        num2 = scanner.nextDouble();

        switch (operator) {
            case '+':
                result = num1+num2;
                break;

            case '-':
                result = num1-num2;
                break;

            case '*':
                result = num1*num2;
                break;

            case '/':
                if (num2 == 0) {
                System.out.println("Помилка: Ділення на нуль!");
                validOperation = false;
            } else {
                result = num1 / num2;
            }
            break;
            case '^':
                result = Math.pow(num1, num2);
                break;
            default:
                System.out.println("Помилка: Невідомий оператор.");
                validOperation = false;
        }
        if (validOperation) {
            System.out.printf("Результат: %.2f", result);
        }
        scanner.close();


        }

}
