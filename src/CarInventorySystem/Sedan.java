package src.CarInventorySystem;

public class Sedan extends Car {

    public Sedan(String vinNumber, String make, String model, int mileage) {
        super(vinNumber, make, model, mileage);
    }

    @Override
    public void start() {
        System.out.println("Starting Sedan...");
    }
}
