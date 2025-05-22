package Lab9.Task1.Task4;

public class Rectangle extends Shape {
    protected double width;
    protected double height;

    public Rectangle (double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    double area() {
        return width * height;
    }
}