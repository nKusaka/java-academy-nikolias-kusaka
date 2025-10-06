package com.pluralsight;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {


        try {

            // Create a file reader object to connect to the file
            FileReader fileReader = new FileReader("employees.csv");

            // Create a buffered reader object to manage input stream
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String input;
            boolean header = true;

            // Read until there is no more data
            while ((input = bufferedReader.readLine()) != null) {
                if (header) {
                    header = false;
                    continue;
                }

                String[] employeeData = input.split("\\|");

                int employeeID = Integer.parseInt(employeeData[0]);
                String name = employeeData[1];
                float hoursWorked = Float.parseFloat(employeeData[2]);
                float payRate = Float.parseFloat(employeeData[3]);


            }
        }
        catch(IOException e) {
            System.out.println("File unreachable");
        }

    }
}