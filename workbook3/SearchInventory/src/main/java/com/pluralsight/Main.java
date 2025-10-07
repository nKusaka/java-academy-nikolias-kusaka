package com.pluralsight;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        // Create inventory list using an array list full of product
        // Create a scanner to take in user input
        ArrayList<Product> inventory = getInventory();
        Scanner read = new Scanner(System.in);
        int userInput = 0;

        // Start program from homescreen
        homeScreen(read, inventory, userInput);

    }

    // This method creates the array list of products to be put into inventory
    public static ArrayList<Product> getInventory() throws IOException{
        ArrayList<Product> inventory = new ArrayList<Product>();

        // BufferedReader and FileReader creation to read from inventory.csv
        FileReader fileReader = new FileReader("inventory.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String input;

        // Read data into a product object and put it into the arraylist-inventory
        while((input = bufferedReader.readLine()) != null) {

            // Delimiter
            String[] productData = input.split("\\|");

            // Pass file data into input array to place in product object later
            int productId = Integer.parseInt(productData[0]);
            String name = productData[1];
            double price = Double.parseDouble(productData[2]);

            // Place input array values into product object
            inventory.add(new Product(productId, name, price));
        }

        fileReader.close();
        bufferedReader.close();
        return inventory;
    }

    // Home screen method
    public static void homeScreen(Scanner read, ArrayList<Product> inventory, int userInput) throws Exception{

        while(userInput != 5) {
            System.out.printf("\nWelcome to Nik's shop" +
                    "\nWhat do you want to do?" +
                    "\n1 - List all products" +
                    "\n2 - Look up a product by its id" +
                    "\n3 - Find all products within a price range" +
                    "\n4 - Add a new product" +
                    "\n5 - Quit the application" +
                    "\nEnter command: ");

            userInput = read.nextInt();

            switch (userInput) {
                case 1:
                    listProducts(inventory);
                    break;
                case 2:
                    findProductId(inventory, read);
                    break;
                case 3:
                    priceRangeLookUp(inventory, read);
                    break;
                case 4:
                    inventory.add(addNewProduct(inventory, read));
                    break;
            }
        }

        System.out.println("\nThank you for visiting have a great day");
        read.close();
    }

    // List all available product
    public static void listProducts(ArrayList<Product> inventory) throws Exception{

        System.out.println("========Available Product========");
        for (Product product : inventory) {
            System.out.println(product);
        }

        System.out.println("\nReturning to home screen....");
        Thread.sleep(2000);
    }

    // Shows a product based on the id the user selects
    public static void findProductId(ArrayList<Product> inventory, Scanner read) throws Exception {

        // Ask user to enter the id of the product they would like to see
        System.out.printf("Please enter the ID of the item you would like to see: ");
        int userInput = read.nextInt();
        boolean productFound;

        // Finds the product with the corresponding id
        for (Product product : inventory) {
            if (userInput == product.getId()) {
                System.out.println("=======Displaying Products Found=======");
                System.out.println(product);
                productFound = true;
            }
        }

        if (!productFound) {
            System.out.println("\nUnable to find product returning to home screen....");
            Thread.sleep(2000);
        }

        System.out.println("\nReturning to home screen....");
        Thread.sleep(2000);
    }

    // Shows available products that are within a price range
    public static void priceRangeLookUp(ArrayList<Product> inventory, Scanner read) throws Exception {

        // This boolean is used in the for loop to see if an item was found therefore the message saying
        // no items found will be displayed if an only if this is false
        boolean itemsFound = false;

        // Prompt user for their price range
        System.out.printf("Please enter the lowest price for items you would like to see: ");
        int lowestPrice = read.nextInt();
        System.out.printf("Please enter the highest price for items you would like to see: ");
        int highestPrice = read.nextInt();
        System.out.println("============Displaying Products In Your Price Range============");

        // Filter products by price
        for(Product product: inventory){
            if(product.getPrice() >= lowestPrice && product.getPrice() <= highestPrice) {
                System.out.println(product);
                itemsFound = true;
            }
        }

        if(!itemsFound) {
            System.out.println("No items were found in your price range");
        }

        System.out.println("\nReturning to home screen....");
        Thread.sleep(2000);
    }

    // Adds a new product to the inventory, updates the ArrayList but not the original csv file
    public static Product addNewProduct(ArrayList<Product> inventory, Scanner read) throws Exception {
        System.out.printf("Enter the ID of the product you would like to add (only numbers): ");
        int id = read.nextInt();
        read.nextLine();
        System.out.printf("Enter the name of the product you would like to add:");
        String name = read.nextLine();
        System.out.printf("Enter the price of the product you would like to add (do not add a dollar sign): ");
        double price = read.nextDouble();

        System.out.println("\nYour product has been added to our inventory, returning to home screen....");
        Thread.sleep(2000);
        return new Product(id, name, price);
    }
}