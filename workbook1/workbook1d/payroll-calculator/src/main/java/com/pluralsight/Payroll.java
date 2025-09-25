package com.pluralsight;
import java.util.Scanner;

public class Payroll {
    public static void main(String[] args){

        // Create scanner for user input
        Scanner read = new Scanner(System.in);

        // Requesting users name, hours worked, and pay rate
        System.out.printf("What is your name? (first and last): ");
        String fullName = read.nextLine();

        System.out.printf("How many hours have you worked this pay period?: ");
        float hoursWorked = read.nextFloat();

        System.out.printf("What is your hourly rate?: ");
        float payRate = read.nextFloat();

        // Output
        System.out.printf("Hello " + fullName + "\nYour Gross Pay: $%.2f", hoursWorked * payRate);
        System.out.println("\n");
    }
}
