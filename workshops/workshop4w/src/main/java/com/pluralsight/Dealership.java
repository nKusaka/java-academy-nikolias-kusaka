package com.pluralsight;

import java.util.ArrayList;

public class Dealership {

    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> inventory;

    public Dealership() {

    }

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    Vehicle getVehiclesByPrice(int min, int max) {

    }

    Vehicle getVehiclesByMakeModel(String make, String model) {

    }

    Vehicle getVehiclesByYear(int min, int max) {

    }

    Vehicle getVehiclesByColor(String color) {

    }

    Vehicle getVehiclesByMileage(int min, int max) {

    }

    Vehicle getVehiclesByType(String vehicleType) {

    }

    Vehicle getAllVehicles() {

    }

    void addVehicle(Vehicle vehicle) {

    }

    void removeVehicle(Vehicle vehicle) {

    }

}
