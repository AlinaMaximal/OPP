package Lab4;

public class Task9 {

    public static int sum(int... numbers){

        int value = 0;
        for (int num : numbers) {
            value += num;
        }
        return value;
    }
    public static void main(String[] args){

        System.out.println("Сума 1 числа: " + sum(6));
        System.out.println("Сума 4 чисел: " + sum(6,5,7,1));
        System.out.println("Сума 6 чисел: " + sum(6,9,3,2,1,8));
    }

}

