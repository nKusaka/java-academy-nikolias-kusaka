package com.pluralsight;
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
        System.out.println("  3 - Search by price range");
        System.out.println("  4 - Search by color");
        System.out.println("  5 - Add a vehicle");
        System.out.println("  6 - Quit");
        System.out.printf("Enter your command: ");
        int command = read.nextInt();

        // while loop insures users input is correct
        while (command != 6) {

            // switch statement for readability and easy access
            switch (command) {
                case 1:
                    listAllVehicles(vehicles, counter);
                    break;
                case 2:
                    //findVehiclesByMakeModel();
                    break;
                case 3:
                    // findVehiclesByPrice();
                    break;
                case 4:
                    // findVehiclesByColor();
                    break;
                case 5:
                    // addVehicle();
                    break;
            }
            System.out.println("What do you want to do?");
            System.out.println("  1 - List all vehicles");
            System.out.println("  2 - Search by make/model");
            System.out.println("  3 - Search by price range");
            System.out.println("  4 - Search by color");
            System.out.println("  5 - Add a vehicle");
            System.out.println("  6 - Quit");
            System.out.printf("Enter your command: ");
            command = read.nextInt();
        }
        System.out.println("Thank you have a good day!");
    }

    // Lists vehicles by their make and model.
    public static void listAllVehicles (Vehicle[] vehicles, int counter){
        System.out.println("Listing all available vehicles");

        for (int i = 0; i < counter; i++) {
            vehicles[i].getVehicle();
        }

        System.out.println();
    }


}