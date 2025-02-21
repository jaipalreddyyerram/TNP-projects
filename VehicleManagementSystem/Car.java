public class Car extends Vehicle {
    private int seatingCapacity;

    public Car(String regNumber, String model, double price, int seatingCapacity) {
        super(regNumber, model, price);
        this.seatingCapacity = seatingCapacity;
    }

    @Override
    public void displayDetails() {
        System.out.println("Car - Reg No: " + regNumber + ", Model: " + model +
                           ", Price: " + price + ", Seating: " + seatingCapacity);
    }
}
