package com.pluralsight;
import java.util.Scanner;

public class Movie {
    public static void main(String[] args) {

        // Variables initialized
        Scanner scanner = new Scanner(System.in);
        String movieTitle;
        int numberOfFriends;
        double pizzaPrice;
        boolean hasPopcorn;
        double drinkPrice;

        // Getting user input with Scanner object
        System.out.println("Enter what movie you would like to see: ");
        movieTitle = scanner.nextLine();
        System.out.println("How many people will be attending: ");
        numberOfFriends = scanner.nextInt();
        System.out.println("What is the price of pizza?: ");
        pizzaPrice = scanner.nextDouble();
        System.out.println("Do you have popcorn? (True/False): ");
        hasPopcorn = scanner.nextBoolean();
        // Clean up variables
        pizzaPrice = Math.round(pizzaPrice);
        drinkPrice = numberOfFriends * 4.99;

        // Output message
        if (pizzaPrice * numberOfFriends > 30)
        {
            System.out.println("Whoa that's a lot of pizza!");
        }
        else
        {
            System.out.println("Nice budget friendly movie night");
        }

        System.out.printf("Movie: " + movieTitle + " | Guests: " + numberOfFriends + " | " +
                "Total cost: $" + (pizzaPrice + drinkPrice));
    }
}
