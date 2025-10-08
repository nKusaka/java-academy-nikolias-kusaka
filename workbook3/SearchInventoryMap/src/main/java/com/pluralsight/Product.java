package com.pluralsight;

public class Product {

    // Initialize in class variables
    private String sku;
    private String name;
    private double price;
    private String department;

    // Default Constructor
    public Product() {

    }

    // Parametrized Constructor
    public Product(String name, double price, String department, String sku) {
        this.name = name;
        this.price = price;
        this.department = department;
        this.sku = sku;
    }

    // Getters and Setters
    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return this.name + " | $" + this.price;
    }
}