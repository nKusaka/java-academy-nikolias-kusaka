package com.pluralsight;

public class CourtyardTraining {
    public static void main(String[] args) {
        String name = "Astra";
        int health = 100;
        int potions = 2;
        int gold = 25;

        // Print start stats
        System.out.println("Hello, " + name + " you have " + health + " health, " + potions + " potions, and " + gold + " gold.");

        // Find 30 gold
        System.out.println("Astra found 30 gold");
        gold += 30;

        // Fight bat: lose 15 health
        System.out.println("Astra fights a bat -15 health");
        health -= 15;

        // Drink potion if available
        if (potions > 0) {
            System.out.println("Astra drinks a potion. +30 health");
            potions -= 1;
            health += 30;
        }
        else {
            System.out.println("Astra is out of potions and can't heal.");

        }

        // Print end stats
        System.out.println("At the end of her journey " + name + " has " + health + " health, " + potions + " potions, and " + gold + " gold.");
    }
}

