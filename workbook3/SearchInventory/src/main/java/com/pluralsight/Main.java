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

            // Pass file data into product variables
            inventory.add(new Product());
        }

        return inventory;
    }
}