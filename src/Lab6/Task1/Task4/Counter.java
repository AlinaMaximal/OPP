package Lab6.Task1.Task4;

public class Counter {

    public int counter;

    public void increment(int increment) {
        counter += increment;
    }

    public void getCount() {
        System.out.println("Число після додавання: " + counter);
    }
}
