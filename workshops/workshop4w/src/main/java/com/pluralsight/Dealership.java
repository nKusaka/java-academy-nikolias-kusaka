package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Dealership {

    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> inventory = new ArrayList<>();

    public Dealership() {

    }

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public ArrayList<Vehicle> getVehiclesByPrice(double min, double max) {

        return (ArrayList<Vehicle>) inventory.stream()
                .filter(vehicle -> vehicle.getPrice() >= min && vehicle.getPrice() <= max)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public ArrayList<Vehicle> getVehiclesByMakeModel(String make, String model) {
        return (ArrayList<Vehicle>) inventory.stream()
                .filter(vehicle -> vehicle.getMake().equalsIgnoreCase(make) && vehicle.getModel().equalsIgnoreCase(model))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public ArrayList<Vehicle> getVehiclesByYear(int min, int max) {
        return (ArrayList<Vehicle>) inventory.stream()
                .filter(vehicle -> vehicle.getYear() >= min && vehicle.getYear() <= max)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public ArrayList<Vehicle> getVehiclesByColor(String color) {
        return (ArrayList<Vehicle>) inventory.stream()
                .filter(vehicle -> vehicle.getColor().equalsIgnoreCase(color))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public ArrayList<Vehicle> getVehiclesByMileage(int min, int max) {
        return (ArrayList<Vehicle>) inventory.stream()
                .filter(vehicle -> vehicle.getOdometer() >= min && vehicle.getOdometer() <= max)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public ArrayList<Vehicle> getVehiclesByType(String vehicleType) {
        return (ArrayList<Vehicle>) inventory.stream()
                .filter(vehicle -> vehicle.getVehicleType().equalsIgnoreCase(vehicleType))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public ArrayList<Vehicle> getAllVehicles() {
        return inventory;
    }

    public Integer[] getAllVehiclesVin() {
        return inventory.stream()
                .map(Vehicle::getVin)
                .toArray(Integer[]::new);
    }

    public void addVehicle(Vehicle vehicle) {
        inventory.add(vehicle);
    }

    public void removeVehicle(int vin, Dealership dealership) {
        inventory.removeIf(vehicle -> vehicle.getVin() == vin);
        DealershipFileManager dealershipFileManager = new DealershipFileManager();
        dealershipFileManager.saveDealership(dealership);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public String getPhone() {
        return this.phone;
    }

}
