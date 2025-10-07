package com.pluralsight;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Create inventory list using an array list full of product
        // Create a scanner to take in user input
        ArrayList<Product> inventory = getInventory();
        Scanner read = new Scanner(System.in);

        for (int i = 0; i < inventory.size(); i++) {
            System.out.println(inventory.get(i));
        }

    }

    // This method creates the array list of products to be put into inventory
    public static ArrayList<Product> getInventory() {
        ArrayList<Product> inventory = new ArrayList<Product>();

        inventory.add(new Product(1, "Keyboard", 40.00));
        inventory.add(new Product(2, "Mouse", 20.00));
        inventory.add(new Product(3, "Monitor", 100.00));
        inventory.add(new Product(4, "Computer", 500.00));
        inventory.add(new Product(5, "Mousepad", 10.00));

        return inventory;
    }
}