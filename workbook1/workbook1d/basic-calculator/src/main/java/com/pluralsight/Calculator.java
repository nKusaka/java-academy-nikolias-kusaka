package com.pluralsight;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){

        // Create scanner to read user input
        Scanner read = new Scanner(System.in);

        // Request user input for two numbers
        System.out.printf("Enter the first number (integer): ");
        int firstNumber = read.nextInt();
        System.out.printf("Enter the second number (integer): ");
        int secondNumber = read.nextInt();

        // Request user to perform add, subtract, multiply or divide
        System.out.println("Possible calculations:");
        System.out.println("(A)dd \n(S)ubtract \n(M)ultiply \n(D)ivide");
        System.out.printf("Input A, S, M, or D: ");

        // Takes in a single character as input
        char operation = read.next().charAt(0);

        // Output
        if (operation == 'A')
        {
            System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
        }
        else if (operation == 'S')
        {
            System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber -secondNumber));
        }
        else if (operation == 'M')
        {
            System.out.println(firstNumber + " * " + secondNumber + " = " + firstNumber * secondNumber);
        }
        else
        {
            System.out.println(firstNumber + " / " + secondNumber + " = " + firstNumber / secondNumber);
        }

    }
}
