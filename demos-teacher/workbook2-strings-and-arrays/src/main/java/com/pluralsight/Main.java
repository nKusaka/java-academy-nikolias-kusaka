package com.pluralsight;

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
    }
}