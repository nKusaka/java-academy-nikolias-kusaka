package com.pluralsight;

public class PowerPuffGirl {

    // Instance variables (typically hidden)
    private String name;
    private int health;
    private String outfitColor;
    private int attackDamage;
    private int power;

    // Constructor
    public PowerPuffGirl(String _name, String _outfitColor) {
        this.name = _name;
        this.outfitColor = _outfitColor;
        this.power = 100;
        this.health = 100;
        this.attackDamage = 100;
    }

    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int newHealth) {
        if (newHealth > 0 && newHealth < 100) {
        this.health = newHealth;
        }
        else{
        System.out.println("Come on, this is not possible");
        }
    }

    public void heal(int healthBoost) {
        System.out.println("Drinking potion");

        int newHealth = this.health + healthBoost;

        if(newHealth > 100) {
            this.setHealth(100);
            System.out.println("Fully recovered");
        } else {
            setHealth(newHealth);
        }
    }
}
