package com.pluralsight;
import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {

        // Initialize scanner object and variables

        Scanner read = new Scanner(System.in);
        String size;

        // Prompt user for input
        System.out.printf("What size sandwhich would you like?\n");
        System.out.println("Please enter either Regular or Large: ");
        size = read.nextLine();

        // Used while loop to make sure user inputs the correct output
        while (!size.equals("Regular") && !size.equals("Large"))
        {
            System.out.printf("Please enter a valid input: ");
            size = read.nextLine();
        }

        System.out.printf("How old are you?: ");
        int age = read.nextInt();

        // Checking the users age to see what discount they get
        if (age <= 17)
        {
            if (size.equals("Regular"))
            {
                System.out.printf("The price of your sandwich is: $%.2f" , 5.45 * .9);
            }
            else
            {
                System.out.printf("The price of your sandwich is: $%.2f" , 8.95 * .9);
            }
        }
        else if (age >= 65)
        {
            if (size.equals("Regular"))
            {
                System.out.printf("The price of your sandwich is: $%.2f" , 5.45 * .8);
            }
            else
            {
                System.out.printf("The price of your sandwich is: $%.2f" , 8.95 * .8);
            }
        }
        else
        {
            if (size.equals("Regular"))
            {
                System.out.printf("The price of your sandwich is: $5.45");
            }
            else
            {
                System.out.printf("The price of your sandwich is: $8.95");
            }
        }
    }
}
