package Lab7.Task1;

public class BankAccount {
    private int accountNumber;
    private double balance;

    public BankAccount(int initializationAccount) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
        public double getBalance() {
            return balance;
        }


    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;} else {
            System.out.println("Баланс не може бути від'ємним.");
    }
    }

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Ваш баланс:" + balance);
            } else {
                System.out.println("Сума для поповнення має бути більше 0.");
            }
        }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;

            System.out.println("Знято " + amount + ". Новий баланс: " + balance);
        } else {
            System.out.println("Недостатньо коштів на рахунку.");
        }

    }
}







