package Lab4;

public class Task4 {public static class Main {

}
        public static void printInfo(String name){

            System.out.println("Name: " + name);

        }

        public static void printInfo(String name, int age){

            System.out.println("Name: " + name + ", Age: " + age);
        }

        public static void main(String[] args){
            printInfo("Mark");
            printInfo("Alina", 22);
        }
    }