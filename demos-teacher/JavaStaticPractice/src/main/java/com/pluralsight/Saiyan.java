package com.pluralsight;

public class Saiyan {

    // instance variables unique for any saiyan
    private String name;
    private int powerLevel;

    // static variables - shared by ALl saiyans
    private static int totalSaiyans = 0;

    public Saiyan(String name, int powerLevel) {
        this.name = name;
        this.powerLevel = powerLevel;
        totalSaiyans++; // One extra saiyan has been created +1


    }

    public void setPowerLevel(int powerLevel) {
        if (powerLevel > 0) {
            this.powerLevel = powerLevel;
        }
    }

    public static void showTotalSaiyans() {
        System.out.println("The total amount of saiyans is: " + totalSaiyans);
    }
}
