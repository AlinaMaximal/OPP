package Lab7.Task1.Task4;
import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserAccount user = new UserAccount("Clementine", "walking dead");

        System.out.print("Введіть пароль: ");
        String inputPassword = scanner.nextLine();

        if (user.login(inputPassword)) {
            System.out.println("Вхід успішний" + user.getUsername());

            System.out.println("Бажаєте змінити пароль?");
            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("так"))
                System.out.print("Введіть старий пароль: ");
            String oldPassword = scanner.nextLine();
            System.out.print("Введіть новий пароль: ");
            String newPassword = scanner.nextLine();
            user.changePassword(oldPassword, newPassword);
    } else {
        System.out.println("Невірний пароль");
    }

        scanner.close();
}
}

