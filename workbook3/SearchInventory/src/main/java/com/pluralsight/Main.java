package com.pluralsight;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Create inventory list using an array list full of product
        // Create a scanner to take in user input
        ArrayList<Product> inventory = getInventory();
        Scanner read = new Scanner(System.in);


    }

    // This method creates the array list of products to be put into inventory
    public static ArrayList<Product> getInventory() {
        ArrayList<Product> inventory = new ArrayList<Product>();

        inventory.add(new Product(1, "Keyboard", 40));

    }
}