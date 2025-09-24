package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Initialize Variables Step 1
        int bobSalary = 40000;
        int garySalary = 50000;
        int highestSalary;

        // Which salary is higher? Step 1
        highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is $" + highestSalary);

        // Initialize Variables Step 2
        int carPrice = 20000;
        int truckPrice = 30000;

        // Which price is smaller? Step 2
        System.out.println("The smaller price is $" + Math.min(carPrice, truckPrice));

        // Initialize Variables Step 3
        double circleRadius = 7.25;
        double circleArea;

        // Find circle area Step 3
        circleArea = circleRadius * circleRadius * Math.PI;

        // Print circle area Step 3
        System.out.println("The area of the circle is " + circleArea);

        // Initialize Variables Step 4
        double number = 5.0;

        // Find square root of number Step 4
        System.out.println(Math.sqrt(number));

        // Initialize Variables Step 5
        int pointXOne = 5;
        int pointYOne = 10;
        int pointXTwo = 85;
        int pointYTwo = 50;

        double distance = Math.sqrt((pointXTwo - pointXOne) * (pointXTwo - pointXOne) + (pointYTwo - pointYOne) * (pointYTwo - pointYOne));
        // Distance between points (5, 10) and (85, 50) Step 5
        System.out.println("The distance between the points (5, 10) and (85, 50) is " + distance);

        // Initialize Variables Step 6
        double absoluteNumber = -3.8;

        // Absolute value of -3.8 Step 6
        System.out.println("The absolute value of -3.8 is " + Math.abs(absoluteNumber));

        // Create random number generator Step 7
        System.out.println((int)(Math.random() * 2));

        // Initialize Variables Step 8
        int minutesInHour = 60;
        int hoursInDay = 24;
        int days = 24;
        int secondsInMinute = 60;
        int millisecondsInSeconds = 1000;
        int totalMinutes;
        int totalMilliseconds;

        totalMinutes = days * hoursInDay * minutesInHour;
        totalMilliseconds = days * hoursInDay * minutesInHour * secondsInMinute * millisecondsInSeconds;

        System.out.println("There are " + totalMinutes + " minutes in a 24 days, and " + totalMilliseconds + " milliseconds in 24 days");
    }
}