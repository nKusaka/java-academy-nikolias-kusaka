package com.pluralsight;
import java.util.Scanner;

public class Movie {
    public static void main(String[] args){

        String movieTitle = "KPop Demon Hunters";
        int numberOfFriends = 5;
        double pizzaSlicePrice = 1.99;
        boolean hasPopcorn = true;

        System.out.println("We're watching " + movieTitle + " with " + numberOfFriends + " friends.");
        System.out.println("Pizza costs " + pizzaSlicePrice + " each.");
        System.out.println("Popcorn? " + hasPopcorn);
        System.out.println("Total pizza cost: $" + pizzaSlicePrice * (numberOfFriends + 1));

        if (hasPopcorn)
        {
            System.out.println("Popcorn time!");
        }
        else
        {
            System.out.println("No popcorn. :( ");
        }
    }
}
