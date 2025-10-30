package com.pluralsight;
import java.io.*;
import java.util.ArrayList;

public class DealershipFileManager {

    public Dealership getDealership() {
        Dealership dealership = new Dealership();
        String csvFile = "inventory.csv";
        String input;
        boolean header = true;

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(csvFile))) {

            while ((input = bufferedReader.readLine()) != null) {
                String[] dealershipData = input.split("\\|");

                if (header) {
                    String name = dealershipData[0];
                    String address = dealershipData[1];
                    String phone = dealershipData[2];
                    header = false;
                    dealership.setName(name);
                    dealership.setAddress(address);
                    dealership.setPhone(phone);

                } else {
                    Vehicle vehicle = getVehicle(dealershipData);
                    dealership.addVehicle(vehicle);
                }
            // bufferedReader.close();
            }

        } catch (IOException e){
            System.out.println("Could not read from file make sure formatting is correct");
        }
        if (dealership == null)
        {
            System.out.println("No dealership has been found");
        }
        return dealership;
    }

    private Vehicle getVehicle(String[] dealershipData) {
        int vin = Integer.parseInt(dealershipData[0]);
        int year = Integer.parseInt(dealershipData[1]);
        String make = dealershipData[2];
        String model = dealershipData[3];
        String vehicleType = dealershipData[4];
        String color = dealershipData[5];
        int odometer = Integer.parseInt(dealershipData[6]);
        double price = Double.parseDouble(dealershipData[7]);

        return new Vehicle(vin, year, make, model, vehicleType, color, odometer, price);
    }

    public void saveDealership(Dealership dealership) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("inventory.csv"))) {
            bufferedWriter.write(dealership.getName() + "|" + dealership.getAddress() + "|" + dealership.getPhone() + "\n");

            for (Vehicle vehicle: dealership.getAllVehicles()) {
                bufferedWriter.write(vehicle.getVin() + "|" + "|" + vehicle.getYear() + "|" + vehicle.getMake() + "|"
                + vehicle.getModel() + "|" + vehicle.getVehicleType() + "|" + vehicle.getColor() + "|" + vehicle.getOdometer() + "|"
                + String.format("%.2f",vehicle.getPrice()) + "\n");
            }
        } catch (IOException e) {
            System.out.println("Unable to save inventory/dealership list to file");
        }
    }
}
