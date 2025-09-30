package com.pluralsight;
import java.lang.*;
import java.util.Scanner;

//for loop practice
public class Main {
    public static void main(String[] args) {
        String myEmailAddress = "rmailjard@yEARup.OrGg";
        if(validateEmailAddress(myEmailAddress)) {
            System.out.println("Correct e-mail address");
        } else {
            System.out.println("Wrong e-mail address");
        }

    }

    public static boolean validateEmailAddress(String email) {
        int validation = email.indexOf("@");
        String emailSymbolValidation = email.substring(validation + 1);
        boolean check;

        if(email.substring(validation + 1).equalsIgnoreCase("yearup.org") || email.substring(validation + 1).equalsIgnoreCase(("skills4-it.nl"))) {
            check = true;
        } else {
            check = false;
        }
        return check;
    }

}