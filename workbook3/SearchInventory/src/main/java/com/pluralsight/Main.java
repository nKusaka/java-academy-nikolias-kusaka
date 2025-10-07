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
                   // findProductId(inventory);
                    //break;
                case 3:
                   // priceRangeLookUp(inventory);
                   // break;
                case 4:
                   // addNewProduct(inventory);
                    //break;
            }
        }

        System.out.println("\nThank you for visiting have a great day");
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
}