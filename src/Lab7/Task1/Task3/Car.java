package Lab7.Task1.Task3;

public class Car {

    private String brand;
    private String model;
    private double speed;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        if (speed > 0) {
            this.speed = speed;
        } else {
            System.out.println("Щвидкість не може бути від'ємною!");
        }
    }


    public void accelerate(int value){
     speed+=value;
        System.out.println("Швидкість після прискорення " + speed);
    }

    public void brake(int value){
        if (speed >= value) {
        speed-=value;
        System.out.println("Швидкість після гальмування " + speed);
    } else {
        System.out.println("Щвидкість не може бути від'ємною!");
    }

    }
}