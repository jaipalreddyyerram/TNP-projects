public abstract class Vehicle {
    protected String regNumber;
    protected String model;
    protected double price;

    public Vehicle(String regNumber, String model, double price) {
        this.regNumber = regNumber;
        this.model = model;
        this.price = price;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public abstract void displayDetails();
}
