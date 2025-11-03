package com.pluralsight;
import java.util.ArrayList;

public class Portfolio {

    // Instantiate class variables
    private String name;
    private String owner;
    private ArrayList<Asset> assets = new ArrayList<Asset>();

    // Parameterized Constructor
    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public ArrayList<Asset> getAssets() {
        return assets;
    }

    public void setAssets(ArrayList<Asset> assets) {
        this.assets = assets;
    }

    // Method to add an asset to the assets array list
    public void addAsset(Asset asset) {
        assets.add(asset);
    }

    // Method to get the total value of all assets in your portfolio
    public double getTotalValue() {
        double totalValue = 0;
        for (Asset asset: assets) {
            totalValue += asset.getValue();
        }
        return totalValue;
    }
}

