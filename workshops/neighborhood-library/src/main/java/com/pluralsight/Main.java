package com.pluralsight;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Initialize variables
        Book[] library = initializeLibrary();
        Scanner read = new Scanner(System.in);

        // Home screen
        int userChoice = homeScreen(read);

        // Loop to keep program running
        while (userChoice != 3) {
            switch (userChoice) {
                case 1:
                    read.nextLine();
                    showAvailableBooks(read, library);
                    break;
                case 2:
                    read.nextLine();
                    showCheckedOutBooks(read, library);
                    break;
            }
            userChoice = homeScreen(read);
        }
    }

    public static Book[] initializeLibrary() {
        Book[] books = new Book[20];
        books[0] = new Book(1, "9783061069094", "Harry Potter");
        books[1] = new Book(2, "9795178347446", "Percy Jackson");
        books[2] = new Book(3, "9795872059423", "Bible");
        books[3] = new Book(4, "9795238310953", "Demon Slayer");
        books[4] = new Book(5, "9780115958212", "Dragonball");
        books[5] = new Book(6, "9781752518869", "Dragonball Z");
        books[6] = new Book(7, "9793724252688", "Bleach");
        books[7] = new Book(8, "9795225941849", "Java for Beginners");
        books[8] = new Book(9, "9784766958959", "C++ for Beginners");
        books[9] = new Book(10, "9792912005228", "Round Table Pizza");
        books[10] = new Book(11, "9794507254592", "In N Out Burger");
        books[11] = new Book(12, "9794234107291", "Amazon Warehouse");
        books[12] = new Book(13, "9791067180002", "Twitch");
        books[13] = new Book(14, "9793818070143", "League of Legends");
        books[14] = new Book(15, "9792974405578", "Valorant");
        books[15] = new Book(16, "9784298976124", "Megabonk");
        books[16] = new Book(17, "9794914822674", "Steam");
        books[17] = new Book(18, "9792764605256", "IntelliJ IDEA");
        books[18] = new Book(19, "9794357809638", "Python for Beginners");
        books[19] = new Book(20, "9785681230601", "Sleep for Dummy's");

        return books;
    }

    // Method for home screen to keep code organized
    public static int homeScreen(Scanner read) {
        System.out.println("=================================================\n"
                         + "                  Home Screen                    \n"
                         + "      Press 1 to show available inventory        \n"
                         + "       Press 2 to show checked out books         \n"
                         + "               Press 3 to exit                   \n"
                         + "=================================================");

        // User input
        System.out.printf("Your choice: ");
        int userChoice = read.nextInt();

        // While loop to ensure correct user input
        while (userChoice != 1 && userChoice != 2 && userChoice != 3) {

            // If user chooses to exit stop the code
            if (userChoice == 3) {
                break;
            }

            System.out.println("=================================================\n"
                             + "                  Home Screen                    \n"
                             + "      Press 1 to show available inventory        \n"
                             + "       Press 2 to show checked out books         \n"
                             + "               Press 3 to exit                   \n"
                             + "=================================================");

            System.out.printf("Your choice: ");
            userChoice = read.nextInt();
        }

        return userChoice;
    }

    // Method to show available books in the library
    public static void showAvailableBooks(Scanner read, Book[] library) {
        System.out.println("========================================\n"
                         + "        Showing available books         \n"
                         + "========================================");

        for (int i = 0; i < 20; i++) {
            System.out.println((i + 1) + ". " + library[i]);
        }

        // Ask user if they would like to check out a book
        System.out.println("Would you also like to check out a book? ");
        System.out.println("Press 1 for Yes, or 2 for No");
        int userChoice = read.nextInt();

        if (userChoice == 1) {

            // Ask user for the id of the book and make sure that book gets checked out i.e. isCheckedOut = true
            System.out.println("Please enter the ID of the book you would like to check out");
            userChoice = read.nextInt();
            library[userChoice - 1].setIsCheckedOut(true);
            read.nextLine();

            // Ask for the users name for CheckOutTo to become the persons name in the book object
            System.out.println("Please enter who is checking out the book, enter your name: ");
            String userName = read.nextLine();
            library[userChoice - 1].checkOut(userName);

            // Ending message
            System.out.println("Enjoy reading your book " + userName);
        }

        System.out.println("Returning to home screen.....");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Method to show check out books from the library
    public static void showCheckedOutBooks(Scanner read, Book[] library) {

        int counter = 0;

        System.out.println("==========================================\n"
                         + "         Showing checked out books        \n"
                         + "==========================================");

        for (int i = 0; i < 20; i++) {
            if (library[i].getIsCheckedOut()) {
                System.out.println(library[i] + " is checked out to " + library[i].getCheckedOutTo());
                counter++;
            }
        }

        if (counter > 0) {
            // Prompting user for input
            System.out.println("Would you like to check in a book?");
            System.out.println("Press C to check in a book or X to go back to the home screen");
            String userChoice = read.nextLine();

            if (userChoice.equalsIgnoreCase("C")) {
                System.out.println("Please enter the ID of the book you would like to check in: ");
                int bookID = read.nextInt();
                library[bookID - 1].checkIn();
                System.out.println("\n\nThank you for checking your book back in have a great day\n\n");
            }

        } else {
            System.out.println("\n\nThere are currently no books checked out\n\n");
        }

        System.out.println("Returning to home screen.....");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

