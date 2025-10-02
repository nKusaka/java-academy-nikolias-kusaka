package com.pluralsight;

public class Vehicle {

    // Variables that describe a car
    private long vehicleID;
    private String makeModel;
    private String color;
    private int odometerReading;
    private float price;

    // Default constructor
    public Vehicle() {
        vehicleID = 0;
        makeModel = "";
        color = "";
        odometerReading = 0;
        price = 0;
    }

    // Parameterized constructor
    public Vehicle(long vehicleID, String makeModel, String color, int odometerReading, float price) {
        this.vehicleID = vehicleID;
        this.makeModel = makeModel;
        this.color = color;
        this.odometerReading = odometerReading;
        this.price = price;
    }

    // Set and get methods
    public void setVehicleID(long vehicleID) {
        this.vehicleID = vehicleID;
    }

    public long getVehicleID() {
        return this.vehicleID;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public String getMakeModel() {
        return this.makeModel;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void setOdometerReading(int odometerReading) {
        this.odometerReading = odometerReading;
    }

    public int getOdometerReading() {
        return this.odometerReading;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getPrice() {
        return this.price;
    }
}
