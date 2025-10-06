package com.pluralsight;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Initialize variables
        Scanner read = new Scanner(System.in);
        String[] quotesArray = initializeQuotesArray();
        String userChoice;
        int userInput;

        // Print out users choice
        do {
            System.out.printf("Pick a number between 1 and 10: ");
            userInput = read.nextInt();
            userInput -= 1;
            read.nextLine();
            try {
                System.out.println(quotesArray[userInput]);
            } catch (Exception e) {
                System.out.println("Your number was out of range");
            }

            System.out.printf("Would you like to see another quote? (Type yes or no): ");
            System.out.printf("\nOr if you would like to see a random quote type random: ");
            userChoice = read.nextLine();

            if (userChoice.equalsIgnoreCase("random")) {
                int randomNumber = (int)(Math.random() * 10) + 1;
                System.out.println(quotesArray[randomNumber]);
            }

        } while (userChoice.equalsIgnoreCase("yes") || userChoice.equalsIgnoreCase("random"));
    }

    // Method to initialize the array full of quotes
    public static String[] initializeQuotesArray() {
        String[] quotesArray = new String[10];

        quotesArray[0] = "Eat breakfast everyday";
        quotesArray[1] = "Sleep 8 hours everyday";
        quotesArray[2] = "If it ain't broke don't fix it";
        quotesArray[3] = "Lift with your legs not your back";
        quotesArray[4] = "Exercise daily";
        quotesArray[5] = "Never stop learning";
        quotesArray[6] = "Try to eat at least 3 meals a day";
        quotesArray[7] = "Drink plenty of water";
        quotesArray[8] = "It is better to be a samurai in a garden than a gardener in a war";
        quotesArray[9] = "Nah ima do my own thing";

        return quotesArray;
    }
}