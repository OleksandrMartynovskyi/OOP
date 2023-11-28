public class Car  {
    private String make;
    private String model;
    private String colour;
    private int year;
    private double price;


    public Car(String make, String model, int year, String colour, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.colour = colour;
        this.price = price;

    }

    //Аксесори (геттери та сеттери) для всіх полів
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    // Гетери та сетери для model
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // Гетери та сетери для year
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Гетери та сетери для color
    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    // Гетери та сетери для price
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
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
}
