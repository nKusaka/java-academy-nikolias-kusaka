package com.pluralsight;
import java.io.*;
import java.nio.Buffer;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Create Scanner to read user input
        Scanner read = new Scanner(System.in);

        // Create new employee array object
        Employee[] employeeArray = new Employee[8];

        // Try catch statement for fileReader
        try {

            // Prompt user input
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

                counter++;
            }

            fileReader.close();
            bufferedReader.close();
        }
        catch(IOException e) {
            System.out.println("File unreachable");
        }

        // Try catch statement for fileWriter
        try {

            String outputFile;

            // Get user input
            System.out.println("Enter the name of the file you would like to write to: ");
            String userFile = read.nextLine();
            FileWriter fileWriter = new FileWriter(userFile);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for(Employee employee : employeeArray){
                if (employee == null) continue;
                outputFile = String.format("%d | %s | %.2f%n",
                employee.getEmployeeID(), employee.getName(), employee.getGrossPay());

                bufferedWriter.write(outputFile);
            }

            bufferedWriter.close();
            fileWriter.close();
        }
        catch (IOException e) {
            System.out.println("File name not specific");
        }
    }
}