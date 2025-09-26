package com.pluralsight;
import java.util.Scanner;

public class Payroll {
    public static void main(String[] args){

        // Create scanner for user input
        Scanner read = new Scanner(System.in);

        // Call methods using scanner parameter and different return types to get input.
        String fullName = fullName(read);
        float hoursWorked = hoursWorked(read);
        float payRate = payRate(read);
        payStub(fullName, hoursWorked, payRate);
    }

    // New method to ask for the users name
    public static String fullName(Scanner read) {
        System.out.printf("What is your name? (first and last): ");
        String fullName = read.nextLine();
        return fullName;
    }

    // New method to take in hours worked
    public static float hoursWorked(Scanner read) {
        System.out.printf("How many hours have you worked this pay period?: ");
        float hoursWorked = read.nextFloat();
        return hoursWorked;
    }

    // New method to take in pay rate
    public static float payRate(Scanner read) {
        System.out.printf("What is your hourly rate?: ");
        float payRate = read.nextFloat();
        return payRate;
    }

    // New method to show employees pay stub
    public static void payStub(String fullName, float hoursWorked, float payRate) {
        if (hoursWorked > 40)
        {
            float overtimeHours = hoursWorked - 40;
            System.out.printf("Hello " + fullName + ", you had " + overtimeHours + " overtime hours this pay period.\nYour Gross Pay With Overtime: $%.2f", ((hoursWorked - overtimeHours) * payRate) + (payRate * 1.5 * overtimeHours));
            System.out.println("\n");
        }
        else
        {
            System.out.printf("Hello " + fullName + "\nYour Gross Pay: $%.2f", hoursWorked * payRate);
            System.out.println("\n");
        }
    }
}
