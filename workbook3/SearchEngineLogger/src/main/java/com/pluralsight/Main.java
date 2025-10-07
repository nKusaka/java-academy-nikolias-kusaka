package com.pluralsight;
import java.io.*;
import java.time.format.*;
import java.util.Scanner;
import java.time.*;

public class Main {
    public static void main(String[] args) throws Exception {

        // Variables to be passed to logUserHistory method
        FileWriter fileWriter = new FileWriter("log.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String searchTerm = "";
        Scanner read = new Scanner(System.in);
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String fileWrite = dateTime.format(formatter);
        String fileStartExit = fileWrite + " launch\n";
        bufferedWriter.write(fileStartExit);

        // Launch the file

        // Ask for user input while they have not decided to close the program
        while (!searchTerm.equalsIgnoreCase("x")) {
            System.out.printf("Enter a search term (X to exit): ");
            searchTerm = read.nextLine();

            if(!searchTerm.equalsIgnoreCase("x")) {
                logUserHistory(bufferedWriter, fileWriter, searchTerm);
            }
        }

        // Exit the program and show exit in file
        dateTime = LocalDateTime.now();
        formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        fileWrite = dateTime.format(formatter);
        fileStartExit = fileWrite + " exit";
        bufferedWriter.write(fileStartExit);

        bufferedWriter.close();
        fileWriter.close();
    }

    // Logs the users history using a bufferedwriter and filewriter
    public static void logUserHistory(BufferedWriter bufferedWriter, FileWriter fileWriter, String searchTerm) {

        // Create local date time variables to log user time they were active
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String fileWrite = dateTime.format(formatter);
        String searchHistory = fileWrite + " search : " + searchTerm + "\n";

        try {
            bufferedWriter.write(searchHistory);
        } catch (IOException e) {
            System.out.println("File not writeable");
        }
    }
}