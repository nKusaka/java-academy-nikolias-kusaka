package com.pluralsight;

public class Menu {
    public static void main(String[] args) {
        displayMenu();
        displayMenu();
    }

    // New method to display menu prices no parameters
    public static void displayMenu() {
        System.out.println("=== Menu ===");
        System.out.println("1. Coffee - $3.99");
        System.out.println("2. Tea - $2.99");
        System.out.println("3. Cookie - $1.99");
    }
}
