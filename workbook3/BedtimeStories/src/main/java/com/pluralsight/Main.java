package com.pluralsight;
import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) {

        // Create new scanner and counter for while loop
        Scanner read = new Scanner(System.in);
        int counter = 1;

        // Prompt user for file name
        System.out.printf("Please enter one of the following, goldilocks.txt," +
                "\nhansel_and_gretel.txt, or mary_had_a_little_lamb.txt: ");

        // Record user input
        String bedtimeStory = read.nextLine();

        // have file reader read users input file and print it out
        try {

            // Create new filereader, bufferreader, and string input to read the file
            FileReader fileReader = new FileReader(bedtimeStory);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String input;

            // while loop to read the file completely
            while((input = bufferedReader.readLine()) != null) {

                System.out.println(counter + ". " + input);
                counter++;
            }
        }
        catch(IOException e) {
            System.out.println("File unreachable");
        }

    }
}