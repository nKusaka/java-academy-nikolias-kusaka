package com.pluralsight;

import java.util.ArrayList;

public class Saiyan {

    // instance variables unique for any saiyan
    private String name;  //
    private int powerlevel;

    // static variables - shared by ALL Saiyans
    private static int totalSaiyans = 0;

    static ArrayList<Saiyan> allSaiyans = new ArrayList<>();

    public Saiyan(String _name, int _powerlevel) {
        this.name = _name;
        this.powerlevel = _powerlevel;
        totalSaiyans++; // One extra saiyan has been created +1
        allSaiyans.add(this);
    }

    public static void showTotalSaiyans() {
        System.out.println("The total amount of saiyans is: " + totalSaiyans);
    }

    public void setPowerlevel(int powerlevel) {
        if(powerlevel > 0) {
            this.powerlevel = powerlevel;
        }
    }


    public static void showAllSaiyansStats() {
        for(Saiyan s : allSaiyans)
        {
            s.showStats();
        }

    }
    //Show stats of Goku
    public void showStats() {
        //non-static is values that belongs to the object
        // static measn generic information not a particilar saiyan or object.

        System.out.println("Name: " + this.name);
        System.out.println("Powerlevel: " + this.powerlevel);
    }
}