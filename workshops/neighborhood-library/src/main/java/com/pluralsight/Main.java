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
        while(userChoice != 4) {
            switch (userChoice) {
                case 1:
                    showAvailableBooks(read, library);
                    break;
                case 2:
                    //showCheckedOutBooks();
                    break;
                case 3:
                    //checkInBook();
                    break;
            }
            userChoice = homeScreen(read);
        }
    }

    public static Book[] initializeLibrary() {
        Book[] books = new Book[20];
        books[0] = new Book(1, "1", "Harry Potter");
        books[1] = new Book(2, "2", "Percy Jackson");
        books[2] = new Book(3, "3", "Bible");
        books[3] = new Book(4,"4","Demon Slayer");
        books[4] = new Book(5,"5","Dragonball");
        books[5] = new Book(6, "6", "Dragonball Z");
        books[6] = new Book(7, "7", "Bleach");
        books[7] = new Book(8, "8", "Java for Beginners");
        books[8] = new Book(9, "9", "C++ for Beginners");
        books[9] = new Book(10, "10", "Round Table Pizza");
        books[10] = new Book(11, "11", "In N Out Burger");
        books[11] = new Book(12, "12", "Amazon Warehouse");
        books[12] = new Book(13, "13", "Twitch");
        books[13] = new Book(14, "14", "League of Legends");
        books[14] = new Book(15, "15", "Valorant");
        books[15] = new Book(16, "16", "Megabonk");
        books[16] = new Book(17, "17", "Steam");
        books[17] = new Book(18, "18", "IntelliJ IDEA");
        books[18] = new Book(19, "19", "Python for Beginners");
        books[19] = new Book(20, "20", "Sleep for Dummy's");

        return books;
    }

    // Method for home screen to keep code organized
    public static int homeScreen(Scanner read) {
        System.out.println("=================================================\n"
                         + "                  Home Screen                    \n"
                         + "      Press 1 to show available inventory        \n"
                         + "       Press 2 to show checked out books         \n"
                         + "            Press 3 to check in a book           \n"
                         + "               Press 4 to exit                   \n"
                         + "=================================================");

        // User input
        System.out.printf("Your choice: ");
        int userChoice = read.nextInt();

        // While loop to ensure correct user input
        while(userChoice != 1 && userChoice != 2 && userChoice != 3) {

            // If user chooses to exit stop the code
            if(userChoice == 4) {
                break;
            }

            System.out.println("=================================================\n"
                             + "                  Home Screen                    \n"
                             + "      Press 1 to show available inventory        \n"
                             + "       Press 2 to show checked out books         \n"
                             + "            Press 3 to check in a book           \n"
                             + "               Press 4 to exit                   \n"
                             + "=================================================");

            System.out.printf("Your choice: ");
            userChoice = read.nextInt();
        }

        return userChoice;
    }

    public static void showAvailableBooks(Scanner read, Book[] library) {
        System.out.println("========================================\n"
                          +"        Showing available books         \n"
                          +"========================================");

        for(int i = 0; i < 20; i++) {
            sout
        }
    }




}

