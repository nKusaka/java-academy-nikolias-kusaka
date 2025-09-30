package com.pluralsight;
import java.lang.*;
import java.util.Scanner;

//for loop practice
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        for(int i = 1; i <= 5; i++){
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }

        int j = 10;
        while(j >= 1) {
            System.out.println("You have " + j + " seconds left");
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
            j--;

        }
        String exitLoop;
        do {
            System.out.printf("Type exit to exit loop: ");
            exitLoop = read.nextLine();
        }
        while(!exitLoop.contains("exit"));

    }
}