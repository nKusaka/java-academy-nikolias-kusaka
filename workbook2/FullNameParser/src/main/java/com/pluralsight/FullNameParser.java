package com.pluralsight;
import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.printf("Please enter your name first and last (optionally with middle initial): ");
        String fullName = read.nextLine();
        fullName = fullName.trim();


        System.out.println("First name: " + fullName.substring(0, fullName.indexOf(' ')));

        System.out.println("Middle name: " + fullName.substring(fullName.indexOf(' '), fullName.lastIndexOf(' ')));

        System.out.println("Last Name: " + fullName.substring(fullName.lastIndexOf(' ')));
    }
}

