public class Truck extends Vehicle {
    private double loadCapacity; // in tons

    public Truck(String regNumber, String model, double price, double loadCapacity) {
        super(regNumber, model, price);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayDetails() {
        System.out.println("Truck - Reg No: " + regNumber + ", Model: " + model +
                           ", Price: " + price + ", Load Capacity: " + loadCapacity + " tons");
    }
}
