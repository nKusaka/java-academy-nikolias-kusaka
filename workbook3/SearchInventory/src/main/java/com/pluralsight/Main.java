package com.pluralsight;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        // Create inventory list using an array list full of product
        // Create a scanner to take in user input
        ArrayList<Product> inventory = getInventory();
        Scanner read = new Scanner(System.in);

        for (Product product : inventory) {
            System.out.println(product);
        }

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
}