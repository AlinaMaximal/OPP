package Lab4;

public class Task10 {



        public static void printNumbers(String message, int... numbers) {
            System.out.println(message);
            if (numbers.length == 0) {
                System.out.println("Немає переданих чисел.");
            } else {
                for (int number : numbers) {
                    System.out.print(number + " ");
                }
                System.out.println();
            }
        }

        public static void main(String[] args) {

            printNumbers("Список чисел 1:", 1, 2, 3);
            printNumbers("Список чисел 2:", 10, 20);
            printNumbers("Список чисел 3:"); // Без чисел
        }
    }

