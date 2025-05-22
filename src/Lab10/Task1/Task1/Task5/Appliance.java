package Lab10.Task1.Task1.Task5;

public  abstract class Appliance {
String brand;

    public Appliance(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

abstract void turnOn();

}
