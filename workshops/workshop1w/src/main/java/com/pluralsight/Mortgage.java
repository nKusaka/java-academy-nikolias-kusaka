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

        System.out.printf("Please enter the length of time to pay back the loan: ");
        loanLength = read.nextInt();
    }

}
