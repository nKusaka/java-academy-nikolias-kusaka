package com.pluralsight;

import java.util.ArrayList;
import java.util.stream.Collectors;

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

    ArrayList<Vehicle> getVehiclesByPrice(double min, double max) {

        return (ArrayList<Vehicle>) inventory.stream()
                .filter(vehicle -> vehicle.getPrice() >= min && vehicle.getPrice() <= max)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    ArrayList<Vehicle> getVehiclesByMakeModel(String make, String model) {
        return (ArrayList<Vehicle>) inventory.stream()
                .filter(vehicle -> vehicle.getMake().equalsIgnoreCase(make) && vehicle.getModel().equalsIgnoreCase(model))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    ArrayList<Vehicle> getVehiclesByYear(int min, int max) {
        return (ArrayList<Vehicle>) inventory.stream()
                .filter(vehicle -> vehicle.getYear() >= min && vehicle.getYear() <= max)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    ArrayList<Vehicle> getVehiclesByColor(String color) {
        return (ArrayList<Vehicle>) inventory.stream()
                .filter(vehicle -> vehicle.getColor().equalsIgnoreCase(color))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    ArrayList<Vehicle> getVehiclesByMileage(int min, int max) {
        return (ArrayList<Vehicle>) inventory.stream()
                .filter(vehicle -> vehicle.getOdometer() >= min && vehicle.getOdometer() <= max)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    ArrayList<Vehicle> getVehiclesByType(String vehicleType) {
        return (ArrayList<Vehicle>) inventory.stream()
                .filter(vehicle -> vehicle.getVehicleType().equalsIgnoreCase(vehicleType))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    ArrayList<Vehicle> getAllVehicles() {
        return inventory;
    }

    void addVehicle(Vehicle vehicle) {
        inventory.add(vehicle);
    }

    void removeVehicle(Vehicle vehicle) {
        inventory.remove(vehicle);
    }

}
