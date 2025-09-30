package com.pluralsight;
import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String fullName = fullName(read);

        System.out.println("Full name: " + fullName);
    }

    public static String fullName(Scanner read) {
        System.out.println("Please enter your name");
        System.out.printf("First name: ");
        String firstName = read.nextLine();

        System.out.printf("Middle name: ");
        String middleName = read.nextLine();

        System.out.printf("Last name: ");
        String lastName = read.nextLine();

        System.out.printf("Suffix: ");
        String suffix = read.nextLine();

        String fullName = suffix.trim() + ". " + firstName.trim() + " " + middleName.trim() + ". " + lastName.trim();

        return fullName;
    }
}
