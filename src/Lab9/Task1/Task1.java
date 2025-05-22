package Lab9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Складання a+b: " + calculator.add(4, 4));

        System.out.println("Складання з плавачою комою: " + calculator.add(0.2, 0.8));

        System.out.println("Складання a+b+c: " + calculator.add(11, 54, 3));
    }
}

