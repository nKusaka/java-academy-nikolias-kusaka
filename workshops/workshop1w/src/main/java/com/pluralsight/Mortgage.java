package com.pluralsight;
import java.util.Scanner;

public class Mortgage {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

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

        display(mortgage, totalInterest);
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

    public static void display(double mortgage, double totalInterest) {
        System.out.printf("Your mortgage will be $%.2f" , mortgage);
        System.out.println();
        System.out.printf("Your total interest that will be paid will be $%.2f" , totalInterest);

    }
}
