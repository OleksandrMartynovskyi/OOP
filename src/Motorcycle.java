public class Motorcycle {
    private String brand;
    private String model;
    private int year;
    private String colour;
    private double price;

    public Motorcycle(String brand, String model, int year, String colour, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.colour = colour;
        this.price = price;
    }


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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColour() {
        return colour;
    }

    public void setColor(String colour) {
        this.colour = colour;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void start() {
        System.out.println("The motorcycle is starting.");
    }
}