package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ContractFileManager {

    public void saveContract(Contract contract, Vehicle vehicle) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("contracts.csv", true))) {

            if (contract instanceof SalesContract sales) {

                double tax = vehicle.getPrice() * 0.05;
                double recordingFee = 100.00;
                double processingFee = vehicle.getPrice() > 10000 ? 495.00 : 295.00;
                String financed = sales.isFinanced() ? "YES" : "NO";
                double monthlyPayment = sales.isFinanced() ? contract.getMonthlyPayment() : 0.00;

                writer.write(String.join("|",
                        "SALE",
                        contract.getDate(),
                        contract.getCustomerName(),
                        contract.getCustomerEmail(),
                        String.valueOf(vehicle.getVin()),
                        String.valueOf(vehicle.getYear()),
                        vehicle.getMake(),
                        vehicle.getModel(),
                        vehicle.getVehicleType(),
                        vehicle.getColor(),
                        String.valueOf(vehicle.getOdometer()),
                        String.format("%.2f", vehicle.getPrice()),
                        String.format("%.2f", tax),
                        String.format("%.2f", recordingFee),
                        String.format("%.2f", processingFee),
                        String.format("%.2f", contract.getTotalPrice()),
                        financed,
                        String.format("%.2f", monthlyPayment)
                ));
                writer.newLine();

            } else if (contract instanceof LeaseContract) {

                writer.write(String.join("|",
                        "LEASE",
                        contract.getDate(),
                        contract.getCustomerName(),
                        contract.getCustomerEmail(),
                        String.valueOf(vehicle.getVin()),
                        String.valueOf(vehicle.getYear()),
                        vehicle.getMake(),
                        vehicle.getModel(),
                        vehicle.getVehicleType(),
                        vehicle.getColor(),
                        String.valueOf(vehicle.getOdometer()),
                        String.format("%.2f", vehicle.getPrice()),
                        String.format("%.2f", vehicle.getPrice() * 0.5),
                        String.format("%.2f", vehicle.getPrice() * 0.07),
                        String.format("%.2f", contract.getTotalPrice()),
                        String.format("%.2f", contract.getMonthlyPayment())
                ));
                writer.newLine();
            }

        } catch (IOException e) {
            System.out.println("Unable to save contract to file: " + e.getMessage());
        }
    }
}