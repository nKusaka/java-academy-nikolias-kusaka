package com.pluralsight;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to our Todo App");

        // Create new object from task class
        Task t = new Task("Learn Java");

        // Print out if the task is completed or not
        System.out.println(t);

        // Set new task as completed and print new message
        t.markCompleted();
        System.out.println(t);
    }
}