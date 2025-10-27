package com.pluralsight;
import java.util.*;
public class UserInterface {

    private Dealership dealership;

    public UserInterface() {

    }

    public UserInterface(Dealership dealership) {
        this.dealership = dealership;
    }

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
                    processGetByMakeModelRequest();
                    break;
                case "3":
                    processGetByYearRequest();
                    break;
                case "4":
                    processGetByColorRequest();
                    break;
                case "5":
                    processGetByMileageRequest();
                    break;
                case "6":
                    processGetByVehicleTypeRequest();
                    break;
                case "7":
                    processGetAllVehiclesRequest();
                    break;
                case "8":
                    processAddVehicleRequest();
                    break;
                case "9":
                    processRemoveVehicleRequest();
                    break;
                case "x":
                    break;
                default:
                    System.out.println("Invalid request type please try again");
                    break;
            }
        }
    }

    public void processGetByPriceRequest(Scanner read) {

        System.out.printf("Enter the minimum price for the vehicles you are looking for: ");
        double min = read.nextDouble();

        System.out.printf("Enter the maximum price for the vehicles you are looking for: ");
        double max = read.nextDouble();
        read.nextLine();

        displayVehicles(dealership.getVehiclesByPrice(min, max));
    }

    public void processGetByMakeModelRequest() {

    }

    public void processGetByYearRequest() {

    }

    public void processGetByColorRequest() {

    }

    public void processGetByMileageRequest() {

    }

    public void processGetByVehicleTypeRequest() {

    }

    public void processGetAllVehiclesRequest() {

    }

    public void processAddVehicleRequest() {

    }

    public void processRemoveVehicleRequest() {

    }

    private void displayVehicles(ArrayList<Vehicle> inventory) {
        System.out.printf("%-10s %-10s %-10s %-12s %-20s %-10s %-14s %-10s\n", "VIN", "YEAR", "MAKE", "MODEL",
                "VEHICLE TYPE", "COLOR", "ODOMETER", "PRICE");
        for (Vehicle vehicle: inventory) {
            System.out.printf("%-10d %-10d %-10s %-12s %-20s %-10s %-14d %-10.2f\n", vehicle.getVin(), vehicle.getYear(), vehicle.getMake(),
                    vehicle.getModel(), vehicle.getVehicleType(), vehicle.getColor(), vehicle.getOdometer(), vehicle.getPrice());
        }
    }

    private void init() {
        DealershipFileManager dealershipFileManager = new DealershipFileManager();
        this.dealership = dealershipFileManager.getDealership();
    }
}
