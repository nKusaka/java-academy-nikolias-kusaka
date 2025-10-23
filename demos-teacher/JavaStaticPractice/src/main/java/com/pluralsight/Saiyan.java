package com.pluralsight;

import java.util.ArrayList;

public class Saiyan {

    // instance variables unique for any saiyan
    private String name;
    private int powerLevel;

    // static variables - shared by ALl saiyans
    private static int totalSaiyans = 0;
    private static ArrayList<Saiyan> allSaiyans = new ArrayList<>();

    public Saiyan(String name, int powerLevel) {
        this.name = name;
        this.powerLevel = powerLevel;
        totalSaiyans++; // One extra saiyan has been created +1
        allSaiyans.add(this);
    }

    public void setPowerLevel(int powerLevel) {
        if (powerLevel > 0) {
            this.powerLevel = powerLevel;
        }
    }

    public static void showAllSaiyansStats() {
        for (Saiyan saiyan: allSaiyans) {
            saiyan.showStats();
        }
    }

    public void showStats() {
        System.out.println(this.name + " " + this.powerLevel);
    }

    public static void showTotalSaiyans() {
        System.out.println("The total amount of saiyans is: " + totalSaiyans);
    }
}
