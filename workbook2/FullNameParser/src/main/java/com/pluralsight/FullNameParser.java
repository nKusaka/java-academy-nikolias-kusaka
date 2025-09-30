package com.pluralsight;
import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.printf("Please enter your name first and last (optionally with middle initial): ");
        String fullName = read.nextLine();
        fullName.trim();


        System.out.println("First name: " + fullName.substring(0, fullName.indexOf(' ')));

       System.out.println("Last name: " + lastName);
    }
}

