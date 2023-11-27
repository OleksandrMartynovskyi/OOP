public class RentalCar extends Car {
    private double rentalRate;

    public RentalCar(String make, String model, int year, String colour, double price, double rentalRate) {
        super(make, model, year, colour, price);
        this.rentalRate = rentalRate;
    }
    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }
}