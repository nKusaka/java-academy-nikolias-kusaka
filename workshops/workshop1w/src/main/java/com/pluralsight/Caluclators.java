package com.pluralsight;
import java.util.Scanner;

public class Caluclators {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.printf("Welcome to my calculator app.\n");
        System.out.printf("Press 1 for the future value calculator.\n");
        System.out.printf("Press 2 for the mortgage calculator.\n");
        System.out.printf("Press 3 for the present value calculator.\n");
        System.out.printf("Please enter a valid number: ");

        int userInput = read.nextInt();


        while(userInput != 1 && userInput != 2 && userInput != 3) {
            System.out.printf("Please enter a valid number: ");
            userInput = read.nextInt();
        }

        if(userInput == 1) {
            futureValueCalculator(read);
        }
        else if(userInput == 2) {
            mortgageCalculator(read);
        }
        else {
            presentValue(read);
        }

    }

    public static void futureValueCalculator(Scanner read) {

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

    public static void mortgageCalculator(Scanner read) {
        int principal;
        double interestRate;
        int loanLength;
        double monthlyPayment;

        System.out.printf("Please enter the principal amount of the loan: $");
        principal = read.nextInt();

        System.out.printf("Please enter the interset rate in decimal form: ");
        interestRate = read.nextDouble();

        System.out.printf("Please enter the length of time to pay back the loan in years: ");
        loanLength = read.nextInt();

        double mortgage = monthlyPayment(principal, interestRate, loanLength);
        double totalInterest = totalInterest(mortgage, loanLength, principal);

        displayMortgage(mortgage, totalInterest);
    }
    public static double monthlyPayment(int principal, double interestRate, int loanLength) {
        int monthlyLoanLength = loanLength * 12;
        double monthlyInterestRate = interestRate / 12;
        double mortgage = principal * (monthlyInterestRate * Math.pow((1 + monthlyInterestRate), monthlyLoanLength) / (Math.pow((1 + monthlyInterestRate), monthlyLoanLength) - 1));

        return mortgage;
    }

    public static double totalInterest(double mortgage, int loanLength, int principal) {
        int monthlyLoanLength = loanLength * 12;
        double totalInterest = (mortgage * monthlyLoanLength) - principal;

        return totalInterest;
    }

    public static void displayMortgage(double mortgage, double totalInterest) {
        System.out.printf("Your mortgage will be $%.2f" , mortgage);
        System.out.println();
        System.out.printf("Your total interest that will be paid will be $%.2f" , totalInterest);

    }

    public static void presentValue(Scanner read) {
        double presentValue;
        int paymentPerMonth;
        double interestRate;
        int years;

        System.out.printf("Please enter the expected dollar amount per month: ");
        paymentPerMonth = read.nextInt();

        System.out.printf("Please enter the annual interest rate in decimal form: ");
        interestRate = read.nextDouble();

        System.out.printf("Please enter the length of time in years you would like to receive payments: ");
        years = read.nextInt();

        presentValue = presentValue(paymentPerMonth, interestRate, years);
        displayPresentValue(presentValue, paymentPerMonth, interestRate, years);
    }

    public static double presentValue(int paymentPerMonth, double interestRate, int years) {
        int lengthInMonths = years * 12;
        double interestRateMonthly = interestRate / 12;
        double presentValue = paymentPerMonth * (1 - Math.pow((1 + interestRateMonthly), (-lengthInMonths))) / interestRateMonthly;

        return presentValue;
    }

    public static void displayPresentValue(double presentValue, int paymentPerMonth, double interestRate, int years) {
        System.out.println("To fund an annuity that pays $" + paymentPerMonth + " for " + years + " years and earns " +
                "an expected %" + interestRate * 100 + "interest,");
        System.out.printf("you would need to invest $%.2f" , presentValue);

    }
}

