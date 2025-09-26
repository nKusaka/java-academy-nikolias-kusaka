package com.pluralsight;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class RentalCar {
    public static void main(String[] args) {

        // Variables to be used for final calculation of car rental
        Scanner read = new Scanner(System.in);
        String pickUPDate = pickUpDate(read);
        int daysRented = daysRented(read);
        boolean tollTag = tollTag(read);
        boolean GPS = gps(read);
        boolean roadSideAssistance = roadSideAssistance(read);
        int age = age(read);
        double surcharge;
        double basicCarRentalCost = basicCarRentalCost(daysRented);
        double optionsCost = optionsCost(tollTag, GPS, roadSideAssistance, daysRented);

        System.out.printf("The basic car rental cost will be: $%.2f" , basicCarRentalCost);
        System.out.println();
        System.out.printf("With the options you selected the extra cost for that will be: $%.2f" , optionsCost);
        System.out.println();

        if(surcharge(age)) {
            surcharge = 1.3;
        }
        else {
            surcharge = 1;
        }

        System.out.printf("Your total will be: $%.2f" , ((basicCarRentalCost + optionsCost) * surcharge));
    }

    // Method for pickup date of rental car. Only deals with month and day.
    public static String pickUpDate(Scanner read) {

        String monthPickUpDate;
        int dayPickUpDate;


        System.out.printf("Please enter the name of the month you would like to pick up your car: ");
        monthPickUpDate = read.nextLine();

        System.out.printf("Please enter the day of the month you would like to pick up (please enter a number 1-30 or 1-31 if applicable): ");
        dayPickUpDate = read.nextInt();

        String pickUpDate = monthPickUpDate + " " + dayPickUpDate;

        return pickUpDate;
    }

    // Method to determine how many days the car will be rented
    public static int daysRented(Scanner read) {

        System.out.printf("For how many days would you like to rent the car (maximum of 14 days allowed): ");
        int daysRented = read.nextInt();

        return daysRented;
    }

    // Method for electric toll tag to the car rental
    public static boolean tollTag(Scanner read) {

        System.out.printf("Would you like an electronic toll tag for an extra $3.95 a day? Enter true or false: ");
        boolean tollTag = read.nextBoolean();

        return tollTag;
    }

    // Method for GPS addition to the car rental
    public static boolean gps(Scanner read) {
        System.out.printf("Would you like to add GPS for an extra $2.95 a day? Enter true or false: ");
        boolean gps = read.nextBoolean();

        return gps;
    }

    // Method for road side assistance to be added to the car rental
    public static boolean roadSideAssistance(Scanner read) {

        System.out.printf("Would you like to add road side assistance for an extra $3.95 a day? Enter true or false: ");
        boolean roadSideAssistance = read.nextBoolean();

        return roadSideAssistance;
    }

    // Method to get the users age
    public static int age(Scanner read) {

        System.out.printf("What is your age?: ");
        int age = read.nextInt();

        return age;
    }

    // Method to perform cost of basic car rental
    public static double basicCarRentalCost(int daysRented) {
        double basicCarRentalCost = daysRented * 29.99;

        return basicCarRentalCost;
    }

    // Method to perform options cost calculation
    public static double optionsCost(boolean tollTag, boolean GPS, boolean roadSideAssistance, int daysRented) {
        double totalCost = 0;

        if(tollTag) {
            totalCost = 3.95 * daysRented;
        }

        if(GPS) {
            totalCost += 2.95 * daysRented;
        }

        if(roadSideAssistance) {
            totalCost += 3.95 * daysRented;
        }

        return totalCost;
    }

    // Method to check for underage driver
    public static boolean surcharge(int age) {
        if(age < 25) {
            return true;
        }
        return false;
    }
}