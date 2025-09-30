package com.pluralsight;
import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.printf("Please enter your name first and last (optionally with middle initial): ");
        String fullName = read.nextLine();

        String firstName = fullNameParser(fullName);

    }

    public static String fullNameParser(String name) {

        System.out.println(name.trim().indexOf(' '));
    }
}

