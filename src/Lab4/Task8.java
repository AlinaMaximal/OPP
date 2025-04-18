package Lab4;

public class Task8 {


        static int counter;

        public static void setCounter(int counter){
            System.out.println("Значення аргументу counter: " + counter);
        }

        public static void main(String[] args) {
            System.out.println("Початкове значення глобального counter: " + counter);

            setCounter(50);

            System.out.println("Глобальний counter після виклику setCounter(): " + counter);
        }
    }

