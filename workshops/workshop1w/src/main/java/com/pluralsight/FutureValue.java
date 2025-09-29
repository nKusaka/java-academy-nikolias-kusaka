package com.pluralsight;
import java.util.Scanner;

public class FutureValue {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int initialDeposit;
        double interestRate;
        int years;

        System.out.printf("How much is your initial deposit?: $");
        initialDeposit = read.nextInt();

        System.out.printf("How much is your interest rate in decimal form?: ");
        interestRate = read.nextDouble();

        System.out.printf("How many years will you let your money grow?: $");
        years = read.nextInt();

        double futureValue = futureValue(initialDeposit, interestRate, years);
        double interestEarned = interestEarned(initialDeposit, futureValue);

        displayFutureValue(futureValue, interestEarned);
    }

    public static double futureValue(int principal, double interestRate, int years) {
        double futureValue = principal * Math.pow((1 + (interestRate / 365) ), (365 * years));

        return futureValue;
    }

    public static double interestEarned(int principal, double futureValue) {
        double interestEarned = futureValue - principal;

        return interestEarned;
    }

    public static void displayFutureValue(double futureValue, double interestEarned) {
        System.out.printf("Your expected future value is: $%.2f" , futureValue);
        System.out.println();
        System.out.printf("Your expected interest earned value is: $%.2f" , interestEarned);

    }

}
