public abstract class Car {
    private static String make;
    private static String model;
    private static String colour;
    private static int year;
    private static double price;

    public Car(String make, String model, int year, String colour, double price) {
    }

    public Car() {

    }

    //Аксесори (геттери та сеттери) для всіх полів
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        Car.make = make;
    }

    // Гетери та сетери для model
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        Car.model = model;
    }

    // Гетери та сетери для year
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        Car.year = year;
    }

    // Гетери та сетери для color
    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        Car.colour = colour;
    }

    // Гетери та сетери для price
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        Car.price = price;
    }

    public void start() {
        System.out.println("The car is starting.");
    }

    public void stop() {
        System.out.println("The car is stopped");
    }

    public void openRoof() {
        System.out.println("Carroof is opened");
    }

    public abstract SportsCar build();

    public abstract static class CarBuilder<T extends CarBuilder<T>> {

        public abstract Car build();

        protected abstract T self();

    }
    public interface Movable {
        void move();
    }
    public interface Equipped {
        void activateAdditionalEquipment();
    }
}
