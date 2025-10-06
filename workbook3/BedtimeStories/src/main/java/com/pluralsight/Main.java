package com.pluralsight;
import java.util.Scanner;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) {

        // Create new scanner and buffered reader
        Scanner read = new Scanner(System.in);
        BufferedReader bufferReader = new BufferedReader(read);

        // Prompt user for file name
        System.out.println("What story would you like to see?");
        System.out.println("Please use the correct format");
        System.out.printf("Please enter one of the follow: goldilocks.txt," +
                "hansel_and_gretel.txt, or mary_had_a_little_lamb.txt");

        // Record user input
        String bedtimeStory = read.nextLine();

    }
}