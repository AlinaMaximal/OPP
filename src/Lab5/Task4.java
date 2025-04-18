package Lab5;

import java.util.Scanner;

public class Task4 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double balance = 0.0;
            int choice;

            do {
                System.out.println("=== Банківське меню ===");
                System.out.println("1. Перевірити баланс");
                System.out.println("2. Внести кошти");
                System.out.println("3. Зняти кошти");
                System.out.println("4. Вийти");
                System.out.print("Ваш вибір: ");

                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        showBalance(balance);
                        break;
                    case 2:
                        balance += deposit(scanner);
                        break;
                    case 3:
                        balance = withdraw(scanner, balance);
                        break;
                    case 4:
                        System.out.println("До побачення!");
                        break;
                    default:
                        System.out.println("Невірний вибір. Спробуйте ще раз.");
                }

            } while (choice != 4);

            scanner.close();
        }

    static void showBalance(double balance) {
        System.out.printf("Поточний баланс: %.2f грн", balance);
    }

    static double deposit(Scanner scanner) {
        System.out.print("Введіть суму для внесення: ");
        double amount = scanner.nextDouble();
        if (amount <= 0) {
            System.out.println("Сума повинна бути більшою за 0.");
            return 0;
        }
        System.out.printf("Успішно внесено: %.2f грн", amount);
        return amount;
    }

    static double withdraw(Scanner scanner, double balance) {
        System.out.print("Введіть суму для зняття: ");
        double amount = scanner.nextDouble();
        if (amount <= 0) {
            System.out.println("Сума повинна бути більшою за 0.");
        } else if (amount > balance) {
            System.out.println("Недостатньо коштів на рахунку.");
        } else {
            balance -= amount;
            System.out.printf("Успішно знято: %.2f грн", amount);
        }
        return balance;
    }
}
