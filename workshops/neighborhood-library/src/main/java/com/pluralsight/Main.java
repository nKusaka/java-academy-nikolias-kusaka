package com.pluralsight;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Book[] library = initializeLibrary();
        Scanner read = new Scanner(System.in);

        System.out.println("=================================================\n"
                         + "                  Home Screen                    \n"
                         + "      Press 1 to show available inventory        \n"
                         + "       Press 2 to show checked out books         \n"
                         + "                Press 3 to exit                  \n"
                         + "=================================================");

        System.out.printf("Your choice: ");
        int userChoice = read.nextInt();

        while(userChoice != 1 && userChoice != 2) {

            if(userChoice == 3) {
                break;
            }

            System.out.println("=================================================\n"
                             + "                  Home Screen                    \n"
                             + "      Press 1 to show available inventory        \n"
                             + "       Press 2 to show checked out books         \n"
                             + "                Press 3 to exit                  \n"
                             + "=================================================");

            System.out.printf("Your choice: ");
            userChoice = read.nextInt();
        }

        switch (userChoice) {
            case 1:
                //availableInventory()
                break;
            case 2:
               //checkedOutBooks()
                break;
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
}