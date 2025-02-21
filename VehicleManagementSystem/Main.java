import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        VehicleManager manager = new VehicleManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nVehicle Management System");
            System.out.println("1. Add Car");
            System.out.println("2. Add Bike");
            System.out.println("3. Add Truck");
            System.out.println("4. Display All Vehicles");
            System.out.println("5. Remove Vehicle");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Registration Number: ");
                    String carReg = scanner.nextLine();
                    System.out.print("Enter Model: ");
                    String carModel = scanner.nextLine();
                    System.out.print("Enter Price: ");
                    double carPrice = scanner.nextDouble();
                    System.out.print("Enter Seating Capacity: ");
                    int seats = scanner.nextInt();
                    manager.addVehicle(new Car(carReg, carModel, carPrice, seats));
                    break;

                case 2:
                    System.out.print("Enter Registration Number: ");
                    String bikeReg = scanner.nextLine();
                    System.out.print("Enter Model: ");
                    String bikeModel = scanner.nextLine();
                    System.out.print("Enter Price: ");
                    double bikePrice = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Type (Sports/Cruiser): ");
                    String bikeType = scanner.nextLine();
                    manager.addVehicle(new Bike(bikeReg, bikeModel, bikePrice, bikeType));
                    break;

                case 3:
                    System.out.print("Enter Registration Number: ");
                    String truckReg = scanner.nextLine();
                    System.out.print("Enter Model: ");
                    String truckModel = scanner.nextLine();
                    System.out.print("Enter Price: ");
                    double truckPrice = scanner.nextDouble();
                    System.out.print("Enter Load Capacity (tons): ");
                    double loadCapacity = scanner.nextDouble();
                    manager.addVehicle(new Truck(truckReg, truckModel, truckPrice, loadCapacity));
                    break;

                case 4:
                    manager.displayAllVehicles();
                    break;

                case 5:
                    System.out.print("Enter Registration Number to Remove: ");
                    String regToRemove = scanner.nextLine();
                    manager.removeVehicle(regToRemove);
                    break;

                case 0:
                    System.out.println("Exiting system...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 0);

        scanner.close();
    }
}
