package com.pluralsight;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Example 1
        // For loop;
        for (int i = 0; i < 3; i++) {
            System.out.println("You guys are cool!");
        }

        // Example 2
        // While loop
        System.out.println("\nWhile loop example:");
        int counter = 3;
        while (counter > 0) {
            System.out.println("Counter is: " + counter);
            counter--; // decrease by 1
        }

        // Example 2b
        // While loop
        System.out.println("\nPassword is incorrect:");
        Scanner read = new Scanner(System.in);

        boolean passwordIncorrect = true;
        String password = "1234";
        String enterPassword = "";

        while (passwordIncorrect == true) {
            System.out.println("What is the password?");
            enterPassword = read.nextLine();
            if (!enterPassword.equals(password))
            {

                System.out.println("Incorrect");
            }
            else
            {
                passwordIncorrect = false;

            }
        }
    }
}