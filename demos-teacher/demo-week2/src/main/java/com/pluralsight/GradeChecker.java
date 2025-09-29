package com.pluralsight;
import java.util.Scanner;

public class GradeChecker {
    public static void main(String[] args) {

        // Created scanner variable and also other variables for use in the program
        Scanner read = new Scanner(System.in);

        // Gets user input and stores in int variable "examScore"
        System.out.printf("What scored did you get on your exam?: ");
        int examScore = read.nextInt();

        // User receives a different output depending on the corresponding integer value they got
        // > 90 = A, > 80 = B, > 70 = C, > 60 = D, < 60 = F
        if (examScore >= 90) {
            System.out.printf("You got an A! Nice job!");
        }
        else if (examScore >= 80) {
            System.out.printf("You got a B! Pretty good!");
        }
        else if (examScore >= 70) {
            System.out.printf("You got a C! Not bad, could use some work.");
        }
        else if (examScore >= 60) {
            System.out.printf("You got a D, keep working on it you can do better.");
        }
        else {
            System.out.printf("You got an F, unlucky.");
        }
    }
}
