package com.pluralsight;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {
        /* This code will take in a persons name, the date they would like to see a movie, and how many tickets they will need.
        It will then output a formatted message confirming the users choices.
         */

        // Needed variables for a name, date, and number of tickets. As well as a scanner to take in user input.
        String name;
        DateTimeFormatter formatter;
        String date;
        int numberOfTickets;
        Scanner read = new Scanner(System.in);

        // Prompting user for input
        System.out.printf("Please enter your name: ");
        name = read.nextLine();

        System.out.printf("What date will you be coming? (MM/dd/yyyy) make sure to enter the 0 for the month if it is less than 10: ");
        date = read.nextLine();

        System.out.printf("How many tickets would you like?: ");
        numberOfTickets = read.nextInt();

        formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        if (numberOfTickets < 2) {
            System.out.println(numberOfTickets + " ticket reserved for " + LocalDate.parse(date, formatter) + " under" + name.substring(name.indexOf(' ')) + " " + name.substring(0,name.indexOf(' ')));

        } else {
            System.out.println(numberOfTickets + " tickets reserved for " + LocalDate.parse(date, formatter) + " under" + name.substring(name.indexOf(' ')) + " " + name.substring(0,name.indexOf(' ')));
        }

    }
}
