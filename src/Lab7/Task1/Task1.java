package Lab7.Task1;

import Lab6.Task1.Person;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Почати роботу? 1-так:");
        int accountNumber = scanner.nextInt();
        BankAccount bank = new BankAccount(accountNumber);

        System.out.print("Введіть свій баланс:");
        bank.setBalance(scanner.nextDouble());

        System.out.println("Ваш поточний баланс: " + bank.getBalance());
        System.out.println("Скільки будете класти?");
        bank.deposit(scanner.nextDouble());

        System.out.println("Скільки будете знімати?");
        bank.withdraw(scanner.nextDouble());

        scanner.close();
    }
}