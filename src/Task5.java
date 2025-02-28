
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextInt();

        int Age = scanner.nextInt();
        System.out.print("Enter your age: ");

        double Height = scanner.nextDouble();
        System.out.print("Enter your height: ");


        System.out.print("You are a student (yes/no):  ");
        boolean isStudent = scanner.nextLine()=="yes" ? true : false ;
g
        System.out.println("Your name: " + name);
        System.out.println("Your age: " + Age);
        System.out.println("Your height: " + Height);
        System.out.println("Your student: " + isStudent);
        scanner.close();

    }
}