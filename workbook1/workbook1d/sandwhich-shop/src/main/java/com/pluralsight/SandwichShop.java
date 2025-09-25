package com.pluralsight;
import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {

        // Initialize scanner object and variables
        Scanner read = new Scanner(System.in);
        String size;
        boolean loaded;

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

        // Loaded sandwiches cost more ask first
        System.out.println("Would you like the sandwich to be loaded?");
        System.out.printf("Please enter Y for yes or N for no: ");
        char question = read.next().charAt(0);

        // While loop to make sure to get correct user input
        while (question != 'Y' && question != 'N')
        {
            System.out.printf("Please enter a valid input: ");
            question = read.next().charAt(0);
        }

        // Check the age to apply a discount if applicable seniors/students
        System.out.printf("How old are you?: ");
        int age = read.nextInt();

        // Checking the users age and if the sandwich was loaded or not to see what discount they get
        if (age <= 17 && question == 'Y')
        {
            if (size.equals("Regular"))
            {
                System.out.printf("The price of your sandwich is: $%.2f" , (5.45 + 1) * .9);
            }
            else
            {
                System.out.printf("The price of your sandwich is: $%.2f" , (8.95+ 1.75) * .9);
            }
        }

        else if (age >= 65 && question == 'Y')
        {
            if (size.equals("Regular"))
            {
                System.out.printf("The price of your sandwich is: $%.2f", (5.45 + 1) * .8);
            } else
            {
                System.out.printf("The price of your sandwich is: $%.2f", (8.95 + 1.75) * .8);
            }
        }
        else if (age >= 65 && question == 'N')
        {
            if (size.equals("Regular"))
            {
                System.out.printf("The price of your sandwich is: $%.2f" , 5.45 * .8);
            }
            else
            {
                System.out.printf("The price of your sandwich is: $%.2f" , 8.95  * .8);
            }
        }

        else if (age <= 17 && question == 'N')
        {
            if (size.equals("Regular"))
            {
                System.out.printf("The price of your sandwich is: $%.2f", 5.45 * .9);
            } else
            {
                System.out.printf("The price of your sandwich is: $%.2f", 8.95 * .9);
            }
        }

        else
        {
            if (size.equals("Regular") && question == 'Y')
            {
                System.out.printf("The price of your sandwich is: $6.45");
            }
            else if (size.equals("Large") && question == 'Y')
            {
                System.out.printf("The price of your sandwich is: $10.70");
            }
            else if (size.equals("Regular") && question == 'N')
            {
                System.out.printf("The price of your sandwich is: 5.45");
            }
            else
            {
                System.out.printf("The price of your sandwich is: 8.95");
            }
        }
    }
}
