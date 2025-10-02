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

    // Parameterized constructor;
    public Vehicle(long vehicleID, String makeModel, int odometerReading, float price) {
        this.vehicleID = vehicleID;
        this.makeModel = makeModel;
        this.odometerReading = odometerReading;
        this.price = price;
    }

}
