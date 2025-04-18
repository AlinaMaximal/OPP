package Lab5;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double principal;
        double monthlyDeposit;
        double annualRate;
        int years;
        int timesCompounded;

        System.out.print("Введіть початкову суму вкладу (грн): ");
        principal = scanner.nextDouble();

        System.out.print("Введіть щомісячний платіж (грн) : ");
        monthlyDeposit = scanner.nextDouble();

        System.out.print("Введіть річну процентну ставку (%): ");
         annualRate = scanner.nextDouble();

        System.out.print("Введіть кількість років: ");
        years = scanner.nextInt();

        System.out.print("Введіть кількість нарахувань відсотків на рік: ");
         timesCompounded = scanner.nextInt();

        double rate = annualRate / 100;

        double compoundFromPrincipal = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);

        double compoundFromDeposits = 0;
        int totalMonths = years * 12;
        for (int i = 1; i <= totalMonths; i++) {

            double timeRemaining = (totalMonths - i + 1) / 12.0;
            compoundFromDeposits += monthlyDeposit * Math.pow(1 + rate / timesCompounded, timesCompounded * timeRemaining);
        }

        double totalAmount = compoundFromPrincipal + compoundFromDeposits;

        System.out.printf("Підсумкова сума через %d років: $%.2f грн",years, totalAmount);
        scanner.close();
    }
}
