package Lab9.Task1.Task4;

public class Task4 {
    public static void main(String[] args){

        Shape shape1 = new Shape();
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(3, 4);

        Shape[] shapes = new Shape[2];

        shapes[0] = circle;
        shapes[1] = rectangle;

        System.out.println(shape1.area());
        for (Shape shape : shapes) {
            System.out.println(shape.area());
        }
    }
}
