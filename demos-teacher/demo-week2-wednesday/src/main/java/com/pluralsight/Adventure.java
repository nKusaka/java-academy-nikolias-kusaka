package com.pluralsight;

public class Adventure {
    public static void main(String[] args) {
        // Variables = Astra's stats / inventory
        String name = "Astra";
        int health = 100;          // whole-number health points
        int gold = 25;             // coins collected
        boolean hasKey = false;    // does Astra have the dungeon key?
        int potions = 2;           // healing potions in inventory

        System.out.println(name + " enters the Dungeon of Debugging.");
        System.out.println("Health: " + health + ", Gold: " + gold + ", Potions: " + potions);
        }
    }

