package Lab4;

public class Task5 {

        public static double calculateArea(double radius) {
            return Math.PI * radius * radius;
        }


        public static double calculateArea(double length, double width) {
            return length * width;
        }

        public static void main(String[] args) {

            double circleArea = calculateArea(5.0);
            System.out.println("Площа кола: " + circleArea);


            double rectangleArea = calculateArea(4.0, 6.0);
            System.out.println("Площа прямокутника: " + rectangleArea);
        }
    }



