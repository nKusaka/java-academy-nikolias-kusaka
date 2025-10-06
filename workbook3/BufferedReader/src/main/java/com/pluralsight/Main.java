package com.pluralsight;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        try {
            // Create new employee array object
            Employee[] employeeArray = new Employee[8];

            // Create Scanner to read user input
            Scanner read = new Scanner(System.in);

            System.out.printf("Please enter a file name to read from: ");
            String userFile = read.nextLine();

            // Create a file reader object to connect to the file
            FileReader fileReader = new FileReader(userFile);

            // Create a buffered reader object to manage input stream
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Variables for while loop to run correctly
            // String input used to read data from file
            // boolean header used to skip the header in the file
            // int counter used to fill Employee array correctly
            String input;
            boolean header = true;
            int counter = 0;

            // Read until there is no more data
            while ((input = bufferedReader.readLine()) != null) {
                if (header) {
                    header = false;
                    continue;
                }

                // Delimeter = |
                String[] employeeData = input.split("\\|");

                // Pass file data into variables to be put into Employee object
                employeeArray[counter] = new Employee();
                int employeeID = Integer.parseInt(employeeData[0]);
                String name = employeeData[1];
                float hoursWorked = Float.parseFloat(employeeData[2]);
                float payRate = Float.parseFloat(employeeData[3]);

                // Pass data into employee array
                employeeArray[counter].setEmployeeID(employeeID);
                employeeArray[counter].setName(name);
                employeeArray[counter].setHoursWorked(hoursWorked);
                employeeArray[counter].setPayRate(payRate);

                // Print out data in a legible format
                System.out.println("Employee ID: " + employeeArray[counter].getEmployeeID() + " Employee name: " + employeeArray[counter].getName() + " Gross Pay: $" + employeeArray[counter].getGrossPay());

                // Increment counter
                counter++;
            }
        }
        catch(IOException e) {
            System.out.println("File unreachable");
        }

    }
}