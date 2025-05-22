package Lab8.Task1.Task4;


public class Task4 {
    public static void main(String[] args){

        Shape shape = new Shape();
        Circle circle  = new Circle (5);
        Rectangle rectangle = new Rectangle(3.0, 5.0);

        System.out.println(shape.area());
        System.out.println(circle.area());
        System.out.println(rectangle.area());
    }
}