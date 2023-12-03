public abstract class SportsCar extends Car implements Car.Equipped {
    private int topSpeed;

    public SportsCar(String make, String model, int year, String colour, double price, int topSpeed) {
    }

    public SportsCar(String make, String model, int year, String colour, double price, double batteryCapacity) {
    }

    @Override
    public SportsCar build() {
        return new SportsCar(getMake(), getModel(), getYear(), getColour(), getPrice(), topSpeed) {
            @Override
            public void activateAdditionalEquipment() {
                System.out.println("The sports car's additional equipment is activated");
            }
        };
    }

    public void move() {
        System.out.println("The electric car is moving silently");
    }

    public static abstract class SportsCarBuilder extends CarBuilder<SportsCarBuilder> {
    }


}