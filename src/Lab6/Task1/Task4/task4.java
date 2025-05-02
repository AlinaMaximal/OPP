package Lab6.Task1.Task4;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Сounter");
        Counter counter = new Counter();
        System.out.print("Введіть число: ");
        counter.counter = scanner.nextInt();
        System.out.println("Збільшити на: " + counter.counter);
        counter.increment(scanner.nextInt());
        counter.getCount();

        System.out.println("Static counter");
        System.out.print("Введіть число: ");
        StaticCounter.counter = scanner.nextInt();
        System.out.println("Збільшити на: " + StaticCounter.counter);
        StaticCounter.increment(scanner.nextInt());
        StaticCounter.getCount();
    }
}

