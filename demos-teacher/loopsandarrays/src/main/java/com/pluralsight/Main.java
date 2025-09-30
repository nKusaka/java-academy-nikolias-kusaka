package com.pluralsight;
import java.lang.*;
import java.util.Scanner;

//for loop practice
public class Main {
    public static void main(String[] args) {
        String myEmailAddress = "rmailjard@skills4-it.nl";
        if(validateEmailAddress(myEmailAddress)) {
            System.out.println("Correct e-mail address");
        } else {
            System.out.println("Wrong e-mail address");
        }

    }

    public static boolean validateEmailAddress(String email) {
        int indexOfSymbol = email.indexOf("@");
        String emailSymbolValidation = email.substring(indexOfSymbol + 1);
        boolean check;

        if(email.substring(indexOfSymbol + 1).equalsIgnoreCase("yearup.org") || email.substring(indexOfSymbol + 1).equalsIgnoreCase(("skills4-it.nl"))) {
            check = true;
        } else {
            check = false;
        }
        return check;
    }

}