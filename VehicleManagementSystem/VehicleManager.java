import java.util.ArrayList;

public class VehicleManager {
    private ArrayList<Vehicle> vehicles;

    public VehicleManager() {
        vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
        System.out.println("Vehicle added successfully!");
    }

    public void removeVehicle(String regNumber) {
        vehicles.removeIf(vehicle -> vehicle.getRegNumber().equalsIgnoreCase(regNumber));
        System.out.println("Vehicle removed (if existed).");
    }

    public void displayAllVehicles() {
        if (vehicles.isEmpty()) {
            System.out.println("No vehicles available.");
            return;
        }
        for (Vehicle vehicle : vehicles) {
            vehicle.displayDetails();
        }
    }
}
