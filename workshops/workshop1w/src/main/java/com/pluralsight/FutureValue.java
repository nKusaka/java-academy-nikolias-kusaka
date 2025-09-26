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

        System.out.printf("How much is your interest rate?: $");
        interestRate = read.nextDouble();

        System.out.printf("How many years will you let your money grow?: $");
        years = read.nextInt();

    }
}
