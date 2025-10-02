package com.pluralsight;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Created scanner object for user input and vehicle array
        Scanner read = new Scanner(System.in);
        Vehicle[] vehicles = new Vehicle[20];

        // Preloaded vehicle array
        vehicles[0] = new Vehicle(101121, "Ford Explorer", "Red", 45000, 13500);
        vehicles[1] = new Vehicle(101122, "Toyota Camry", "Blue", 60000, 11000);
        vehicles[2] = new Vehicle(101123, "Chevrolet Malibu", "Black", 50000, 9700);
        vehicles[3] = new Vehicle(101124, "Honda Civic", "White", 70000, 7500);
        vehicles[4] = new Vehicle(101125, "Subaru Outback", "Green", 55000, 14500);
        vehicles[5] = new Vehicle(101126, "Jeep Wrangler", "Yellow", 30000, 16000);

        // Create counter for array
        int counter = 6;
        // Prompting user for input
        System.out.println("What do you want to do?");
        System.out.println("  1 - List all vehicles");
        System.out.println("  2 - Search by make/model");
        System.out.println("  3 - Sort vehicles by price");
        System.out.println("  4 - Search by price range");
        System.out.println("  5 - Search by color");
        System.out.println("  6 - Add a vehicle");
        System.out.println("  7 - Quit");
        System.out.printf("Enter your command: ");
        int command = read.nextInt();

        // while loop insures users input is correct
        while (command != 7) {

            // switch statement for readability and easy access
            switch (command) {
                case 1:
                    listAllVehicles(vehicles, counter);
                    break;
                case 2:
                    findVehiclesByMakeModel(vehicles, counter);
                    break;
                case 3:
                    sortVehiclesByPrice(vehicles, counter);
                    break;
                case 4:
                    System.out.printf("Please enter the lowest value vehicles you would like to see: ");
                    float lowest = read.nextFloat();
                    System.out.printf("Please enter the highest value vehicles you would like to see: ");
                    float highest = read.nextFloat();
                    findVehiclesByPrice(vehicles, lowest, highest, counter);
                    break;
                case 5:
                    read.nextLine();
                    System.out.printf("Please enter the color of the vehicle you are looking for: ");
                    String color = read.nextLine();
                    findVehiclesByColor(vehicles, color, counter);
                    break;
                case 6:
                    // addVehicle();
            }
            System.out.println("What do you want to do?");
            System.out.println("  1 - List all vehicles");
            System.out.println("  2 - Search by make/model");
            System.out.println("  3 - Sort vehicles by price");
            System.out.println("  4 - Search by price range");
            System.out.println("  5 - Search by color");
            System.out.println("  6 - Add a vehicle");
            System.out.println("  7 - Quit");
            System.out.printf("Enter your command: ");
            command = read.nextInt();
        }
        System.out.println("Thank you have a good day!");
    }

    // Lists vehicles no filter
    public static void listAllVehicles (Vehicle[] vehicles, int counter) {
        System.out.println("Listing all available vehicles");

        for (int i = 0; i < counter; i++) {
            vehicles[i].displayVehicle();
        }

        System.out.println();
    }

    // Lists all vehicles by make and model
    public static void findVehiclesByMakeModel(Vehicle[] vehicles, int counter) {
        System.out.println("Listing all vehicles by make and model");

        for (int i = 0; i < counter; i++) {
            System.out.println(vehicles[i].getMakeModel());
        }

        System.out.println();
    }

    // Lists all vehicles by price
    public static void sortVehiclesByPrice(Vehicle[] vehicles, int counter) {

        // Using sorted prices array and checking vehicles array to sort it.
        for (int i = 0; i < counter; i++) {
            for (int j = 0; j < counter - 1 - i; j++) {
                if (vehicles[j].getPrice() > vehicles[j + 1].getPrice()) {
                    Vehicle temp = vehicles[j];
                    vehicles[j] = vehicles[j + 1];
                    vehicles[j + 1] = temp;
                }
            }
        }
        System.out.println("Vehicles sorted by lowest price to highest price");
        for (int i = 0; i < counter; i++) {
            vehicles[i].displayVehicle();
        }
    }

    // Show all vehicles within a price range
    public static void findVehiclesByPrice(Vehicle[] vehicles, float lowest, float highest, int counter) {

        System.out.println("Displaying vehicles within your price range");

        for (int i = 0; i < counter; i++) {
            if (vehicles[i].getPrice() >= lowest && vehicles[i].getPrice() <= highest) {
                vehicles[i].displayVehicle();
            }
        }
        System.out.println();
    }

    // Show all vehicles that are a specific color
    public static void findVehiclesByColor(Vehicle[] vehicles, String color, int counter) {

        System.out.println("Displaying all vehicles with the color " + color);

        for (int i = 0; i < counter; i++) {
            if(color.equalsIgnoreCase(vehicles[i].getColor())) {
                vehicles[i].displayVehicle();
            }
        }
        System.out.println();

    }
}