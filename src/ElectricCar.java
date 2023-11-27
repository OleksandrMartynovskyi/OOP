public class ElectricCar extends Car {
    private double batteryCapacity;

    public ElectricCar(String make, String model, int year, String colour, double price, double batteryCapacity) {
        super(make, model, year, colour, price);
        this.batteryCapacity = batteryCapacity;
    }
    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
}