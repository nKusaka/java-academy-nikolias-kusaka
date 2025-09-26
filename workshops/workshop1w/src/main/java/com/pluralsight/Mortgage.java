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
    }

    public static double monthlyPayment(int principal, double interestRate, int loanLength) {
        int monthlyLoanLength = loanLength * 12;
        double mortgage = principal * (interestRate * Math.pow((1 + interestRate), monthlyLoanLength) / (Math.pow((1 + interestRate), monthlyLoanLength) - 1));

        return mortgage;
    }

    public static double totalInterest(double mortgage, int loanLength, int principal) {
        int monthlyLoanLength = loanLength * 12;
        double totalInterest = (mortgage * monthlyLoanLength) - principal;

        return totalInterest;
    }
}
