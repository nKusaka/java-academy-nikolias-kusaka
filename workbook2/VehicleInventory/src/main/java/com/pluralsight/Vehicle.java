package com.pluralsight;

public class Vehicle {
    // Variables that describe a car
    private long vehicleID;
    private String makeModel;
    private int odometerReading;
    private float price;

    // Default constructor
    public Vehicle() {
        vehicleID = 0;
        makeModel = "";
        odometerReading = 0;
        price = 0;
    }

    // Parameterized constructor
    public Vehicle(long vehicleID, String makeModel, int odometerReading, float price) {
        this.vehicleID = vehicleID;
        this.makeModel = makeModel;
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
