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

        // Create an array of 3 tasks
        Task[] tasks = new Task[3];

        // Initialize 3 tasks in tasks array
        tasks[0] = new Task("Learn the basics of Classes and Methods in Java");
        tasks[1] = new Task("Fill out this Year Up online form. It's feedback for Yearup about how you guys think the lessons are doing");
        tasks[2] = new Task("Share your most fun exercise we did in class");

        // Step 3: mark task('s) as completed
        tasks[1].markCompleted();
        tasks[2].markCompleted();
        tasks[0].markCompleted();
        // Step 4: loop through the array and print each task
        for (Task task : tasks) {
            System.out.println(task);
        }
    }


}