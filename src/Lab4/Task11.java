package Lab4;

public class Task11 {


    public static int findMax(int... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Не передано жодного числа.");
        }

        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        System.out.println("Максимум (3, 7, 2): " + findMax(3, 7, 2));
        System.out.println("Максимум (10, 20, 30, 5): " + findMax(10, 20, 30, 5));
        System.out.println("Максимум (42): " + findMax(42));
    }
}

