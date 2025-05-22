package Lab7.Task1.Task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book book = new Book();

        System.out.print("Введіть назву книги:");
        book.setTitle(scanner.nextLine());
        System.out.print("Введіть автора книги:");
        book.setAuthor(scanner.nextLine());
        System.out.print("Введіть ціну:");
        book.setPrice(scanner.nextDouble());

        book.displayInfo();
        scanner.close();
}
}