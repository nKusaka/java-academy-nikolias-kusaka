package com.pluralsight;
import java.lang.*;
import java.util.Scanner;

//for loop practice
public class Main {
    public static void main(String[] args) {
        String myEmailAddress = "rmailjard@yEARup.OrG";

        int validation = myEmailAddress.indexOf("@");
        String check = myEmailAddress.substring(validation+1);
        if(myEmailAddress.substring(validation + 1).equalsIgnoreCase("yearup.org")) {
            System.out.println("Correct e-mail address");
        } else {
            System.out.println("Wrong e-mail address");
        }
    }
}