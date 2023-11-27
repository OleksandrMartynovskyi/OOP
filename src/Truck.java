public class Truck extends Car {
    private double cargoCapacity;

    public Truck(String make, String model, int year, String colour, double price, double cargoCapacity) {
        super(make, model, year, colour, price);
        this.cargoCapacity = cargoCapacity;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }
}