package Lab10.Task1.Task1.Task5;

public class Main {
    public static void main(String[] args) {
        WasherDryer washerDryer=new WasherDryer("Samsung");

        washerDryer.turnOn();
        washerDryer.wash();
        washerDryer.dry();

        Appliance appliance = new WasherDryer("Miele");
        Washable washable = new WasherDryer("AEG");
        Dryable dryable = new WasherDryer("Panasonic");

        appliance.turnOn();
        washable.wash();
        dryable.dry();
    }
}
