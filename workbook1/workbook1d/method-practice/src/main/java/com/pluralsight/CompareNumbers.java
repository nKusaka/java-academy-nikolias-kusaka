package com.pluralsight;

public class CompareNumbers {
    public static void main(String[] args) {
        System.out.println("isEven method: " + (isEven(6)));
        System.out.println("isPostive method: " + (isPositive(5)));
    }

    // New method that takes in an integer parameter and returns a boolean
    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    // New method that takes in a double parameter and returns a boolean
    public static boolean isPositive(double number) {
        if (number > 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
