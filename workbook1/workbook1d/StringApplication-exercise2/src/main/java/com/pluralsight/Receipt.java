package com.pluralsight;

public class Receipt {
    public static void main(String[] args){

        //Initialize Variables
        String item = "apples";
        double price = 4.99;
        int quantity = 5;

        //Print statement
        System.out.println("You bought " + quantity + " " + item + " for " + Math.round(price * quantity * 100.0) / 100.0 + '.');

    }
}
