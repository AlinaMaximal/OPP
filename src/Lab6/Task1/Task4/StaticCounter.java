package Lab6.Task1.Task4;

public class StaticCounter {

    public static int counter;

    public static void increment(int increment) {
        counter += increment;
    }

    public static void getCount() {
        System.out.println("Число після додавання: " + counter);
    }
}
