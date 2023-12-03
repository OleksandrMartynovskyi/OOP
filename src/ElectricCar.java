public abstract class ElectricCar extends Car implements Car.Movable {
    private double batteryCapacity;

    public ElectricCar(String make, String model, int year, String colour, double price, double batteryCapacity) {
        super();
    }

    @Override
    public SportsCar build() {
        return new SportsCar(getMake(), getModel(), getYear(), getColour(), getPrice(), batteryCapacity) {
            @Override
            public void activateAdditionalEquipment() {

            }

        };
    }

    public static abstract class ElectricCarBuilder extends Car {

        public ElectricCarBuilder(String make, String model, int year, String colour, double price) {
            super(make, model, year, colour, price);
        }
    }
    protected ElectricCar self() {
        return this;
    }

}