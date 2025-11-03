package com.pluralsight;

// This class implements the Valuable interface
public class Asset implements Valuable {

    // Instantiate class variables
    private String name;
    private double marketValue;

    // Parameterized Constructor
    public Asset(String name, double value) {
        this.name = name;
        this.marketValue = value;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarketValue(double marketValue) {
        this.marketValue = marketValue;
    }

    // Method to return the market value of the asset
    public double getValue() {
        return marketValue;
    }
}
