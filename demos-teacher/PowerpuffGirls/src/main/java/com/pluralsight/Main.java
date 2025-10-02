package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        // Todo: A PowerPuff fighting game
        // Features
        // - Play online

        //Customizing Character
        // Costumes
        // Solo Mode
        // Finishing Moves
        // Team Attack
        // Dialogue
        // Health Boost


        PowerPuffGirl blossom = new PowerPuffGirl("Blossom", "Pink");

        System.out.println(blossom.getHealth());
        blossom.setHealth(20);
        blossom.heal(20);
        System.out.println(blossom.getHealth());


        blossom.setHealth(40);
        blossom.heal(100);
        System.out.println(blossom.getHealth());

    }
}