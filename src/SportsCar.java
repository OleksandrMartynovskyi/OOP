public class SportsCar extends Car {
    private int topSpeed;

    public SportsCar(String make, String model, int year, String colour, double price, int topSpeed) {
        super(make, model, year, colour, price);
        this.topSpeed = topSpeed;
    }
    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }
}