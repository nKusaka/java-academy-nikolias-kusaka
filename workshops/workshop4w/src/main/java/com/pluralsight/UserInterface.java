package com.pluralsight;
import java.util.*;
public class UserInterface {

    private Dealership dealership;

    // Default Constructor
    public UserInterface() {

    }

    // Parameterized Constructor
    public UserInterface(Dealership dealership) {
        this.dealership = dealership;
    }

    // Creates the display menu for the user and asks for user input on what they would like to do
    public void display() throws Exception {
        init();
        String userInput = "";
        Scanner read = new Scanner(System.in);

        while (!userInput.equalsIgnoreCase("x")) {
            System.out.println("""
                    ===============================================================
                    Welcome to your personal dealership searching website
                    Please enter one of the following numbers that meets your needs
                    1. Get vehicles within a price range
                    2. Get vehicles my make and model
                    3. Get vehicles by year
                    4. Get vehicles by color
                    5. Get vehicles by mileage
                    6. Get vehicles by type of vehicle (truck, sedan etc..)
                    7. Get all vehicles
                    8. Add a vehicle to the dealership
                    9. Remove a vehicle from the dealership
                    X. to exit the application
                    ================================================================""");
            userInput = read.nextLine();

            switch(userInput) {
                case "1":
                    processGetByPriceRequest(read);
                    break;
                case "2":
                    processGetByMakeModelRequest(read);
                    break;
                case "3":
                    processGetByYearRequest(read);
                    break;
                case "4":
                    processGetByColorRequest(read);
                    break;
                case "5":
                    processGetByMileageRequest(read);
                    break;
                case "6":
                    processGetByVehicleTypeRequest(read);
                    break;
                case "7":
                    processGetAllVehiclesRequest();
                    break;
                case "8":
                    processAddVehicleRequest(read);
                    break;
                case "9":
                    processRemoveVehicleRequest(read);
                    break;
                case "x":
                    break;
                default:
                    System.out.println("Invalid request type please try again");
                    break;
            }
        }
    }

    // Calls dealership method to get vehicles by price and takes in input from the user
    public void processGetByPriceRequest(Scanner read) {

        System.out.printf("Enter the minimum price for the vehicles you are looking for: ");
        double min = read.nextDouble();

        System.out.printf("Enter the maximum price for the vehicles you are looking for: ");
        double max = read.nextDouble();
        read.nextLine();

        displayVehicles(dealership.getVehiclesByPrice(min, max));
    }

    // Calls dealership method to get vehicles by make and model and takes in input from the user
    public void processGetByMakeModelRequest(Scanner read) {

        System.out.printf("Enter the make of the vehicle you are looking for: ");
        String make = read.nextLine();

        System.out.printf("Enter the model of the vehicle you are looking for: ");
        String model = read.nextLine();

        displayVehicles(dealership.getVehiclesByMakeModel(make,model));
    }

    // Calls dealership method to get vehicles by year and takes in input from the user
    public void processGetByYearRequest(Scanner read) {

        System.out.printf("Enter the minimum year for vehicles you are looking for: ");
        int minYear = read.nextInt();

        System.out.printf("Enter the maximum year for vehicles you are looking for: ");
        int maxYear = read.nextInt();
        read.nextLine();

        displayVehicles(dealership.getVehiclesByYear(minYear, maxYear));
    }

    // Calls dealership method to get vehicles by color and takes in input from the user
    public void processGetByColorRequest(Scanner read) {

        System.out.printf("Enter the color of vehicles you are a looking for: ");
        String color = read.nextLine();

        displayVehicles(dealership.getVehiclesByColor(color));
    }

    // Calls dealership method to get vehicles by mileage and takes in input from the user
    public void processGetByMileageRequest(Scanner read) {

        System.out.printf("Enter the minimum mileage of vehicles you are looking for: ");
        int minMileage = read.nextInt();

        System.out.printf("Enter the maximum mileage of vehicles you are looking for: ");
        int maxMileage = read.nextInt();
        read.nextLine();

        displayVehicles(dealership.getVehiclesByMileage(minMileage, maxMileage));
    }

    // Calls dealership method to get vehicles by type and takes in input from the user
    public void processGetByVehicleTypeRequest(Scanner read) {

        System.out.printf("Enter the type of vehicle you are looking for: ");
        String vehicleType = read.nextLine();

        displayVehicles(dealership.getVehiclesByType(vehicleType));
    }

    // Calls dealership method to get all vehicles
    public void processGetAllVehiclesRequest() {
        displayVehicles(dealership.getAllVehicles());
    }

    // Calls dealership method to add a vehicle to the dealership checks that last 5 digits of vin number is unique
    public void processAddVehicleRequest(Scanner read) {

        System.out.printf("Enter the last 5 vin numbers for the vehicle: ");
        int vin = read.nextInt();
        read.nextLine();
        boolean isValid = false;

        Integer[] vinArray = dealership.getAllVehiclesVin();

        do {
            for (int i = 0; i < vinArray.length - 1; i++) {
                if (vin == vinArray[i]) {
                    System.out.printf("Invalid vin number try again: ");
                    vin = read.nextInt();
                } else {
                    isValid = true;
                    read.nextLine();
                }
            }
        } while (isValid = false);

        System.out.printf("Enter the year the vehicle was made: ");
        int year = read.nextInt();
        read.nextLine();

        System.out.printf("Enter the make of the vehicle: ");
        String make = read.nextLine();

        System.out.printf("Enter the model of the vehicle: ");
        String model = read.nextLine();

        System.out.printf("Enter the type of vehicle: ");
        String vehicleType = read.nextLine();

        System.out.printf("Enter the color of the vehicle: ");
        String color = read.nextLine();

        System.out.printf("Enter the mileage on the vehicle: ");
        int odometer = read.nextInt();
        read.nextLine();

        System.out.printf("Enter the price of the vehicle: ");
        double price = read.nextDouble();
        read.nextLine();

        dealership.addVehicle(new Vehicle(vin, year, make, model, vehicleType, color, odometer, price));
        System.out.println("Successfully added vehicle to the dealership");
    }

    // Calls dealership method to remove a vehicle from the dealership
    public void processRemoveVehicleRequest(Scanner read) {
        System.out.printf("Enter the vin number for the vehicle you would like to remove: ");
        int vin = read.nextInt();
        read.nextLine();
        dealership.removeVehicle(vin);
        DealershipFileManager dealershipFileManager = new DealershipFileManager();
        dealershipFileManager.saveDealership(dealership);
        System.out.println("Successfully removed vehicle from the dealership");
    }

    // Helper method to display the vehicles in a neat way
    private void displayVehicles(ArrayList<Vehicle> inventory) {
        System.out.printf("%-10s %-10s %-10s %-12s %-20s %-10s %-14s %-10s\n", "VIN", "YEAR", "MAKE", "MODEL",
                "VEHICLE TYPE", "COLOR", "ODOMETER", "PRICE");

        if (inventory.isEmpty()) {
            System.out.println("There were no vehicles matching your search");
        } else {
            for (Vehicle vehicle: inventory) {
            System.out.printf("%-10d %-10d %-10s %-12s %-20s %-10s %-14d %-10.2f\n", vehicle.getVin(), vehicle.getYear(), vehicle.getMake(),
                    vehicle.getModel(), vehicle.getVehicleType(), vehicle.getColor(), vehicle.getOdometer(), vehicle.getPrice());
            }
        }
    }

    // init method that loads the dealership object by creating a dealershipfilemanager object and loading
    // vehicles from inventory.csv
    private void init() {
        DealershipFileManager dealershipFileManager = new DealershipFileManager();
        this.dealership = dealershipFileManager.getDealership();
    }
}
