package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Saiyan goku = new Saiyan("Goku", 10000);
        goku.setPowerLevel(200);
        Saiyan.showTotalSaiyans();
        // Static method is not connected to a specific Saiyan


        Saiyan.showTotalSaiyans();
        Saiyan.showAllSaiyansStats();

    }
}