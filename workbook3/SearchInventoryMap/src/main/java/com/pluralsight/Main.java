package com.pluralsight;
import java.io.*;
import java.util.*;

public class Main {

    // Runs/Starts the program
    public static void main(String[] args) throws Exception {

        // Create variables to be used globally in program
        HashMap<String, Product> inventory = loadInventory();
        Scanner read = new Scanner(System.in);
        HomeScreen(inventory, read);


    }

    // Loads hashmap with inventory list giving each name of the product a key that will
    // be used to look up its value
    public static HashMap<String, Product> loadInventory() throws Exception {

        FileReader fileReader = new FileReader("products.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String input;
        boolean header = true;
        HashMap<String, Product> inventory = new HashMap<>();

        while((input = bufferedReader.readLine()) != null) {
            if(header) {
                header = false;
                continue;
            }
            String[] productData = input.split("\\|");
            String sku = productData[0];
            String name = productData[1];
            double price = Double.parseDouble(productData[2]);
            String department = productData[3];

            inventory.put(name, new Product(name, price, department, sku));

        }
        bufferedReader.close();
        fileReader.close();

        return inventory;
    }

    // Home screen for program UI
    public static void HomeScreen(HashMap<String, Product> inventory, Scanner read) {

        System.out.println("Welcome to the shop");
        String keepSearching = "yes";

        while (keepSearching.equalsIgnoreCase("yes")) {

            inventorySearch(inventory, read);

            System.out.println("\nWould you like to look for another item? (types yes or no): ");
            keepSearching = read.nextLine();
        }
    }

    // Searching method
    public static void inventorySearch(HashMap<String, Product> inventory, Scanner read) {

        // Get user input and create variables for lookups
        System.out.printf("What item are you looking for today?: ");
        String userInput = read.nextLine().toLowerCase().trim();
        boolean itemFound = false;
        boolean header = false;

        // Look through all keys in hashmap if the key contains any part of the users input then set
        // itemfound to true and display the product
        // additionally when the item is found a header is displayed only one by setting the boolean header to true after
        // it has been displayed once
        for (String name : inventory.keySet()) {
            if (name.trim().toLowerCase().contains(userInput)) {
                itemFound = true;
                if(!header) {
                    System.out.println("Items matching your description:");
                    header = true;
                }
                System.out.println(inventory.get(name));
            }
        }

        // message if no item is found in the lookup
        if (!itemFound) {
            System.out.println("Your item could not be found");
        }
    }
}

