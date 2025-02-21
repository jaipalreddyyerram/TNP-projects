public class Bike extends Vehicle {
    private String type; // Sports, Cruiser, etc.

    public Bike(String regNumber, String model, double price, String type) {
        super(regNumber, model, price);
        this.type = type;
    }

    @Override
    public void displayDetails() {
        System.out.println("Bike - Reg No: " + regNumber + ", Model: " + model +
                           ", Price: " + price + ", Type: " + type);
    }
}
