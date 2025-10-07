package com.pluralsight;

public class Product {

    // Class variables
    private int id;
    private String name;
    private double price;

    // Product constructor without parameters
    public Product() {

    }

    // Product constructor
    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Getters
    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return "ID:" + this.id + " " + this.name + " $" + this.price;
    }
}
