package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.math.*;
import java.util.ArrayList;

public class ContractFileManager {

    public void saveContract(ArrayList<Contract> contractArrayList) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("contracts.csv"))) {
            for (Contract contract : contractArrayList) {
                if (contract instanceof SalesContract sales) {

                    double tax = contract.getVehicleSold().getPrice() * 0.05;
                    double recordingFee = 100.00;
                    double processingFee = contract.getVehicleSold().getPrice() > 10000 ? 495.00 : 295.00;
                    String financed = sales.isFinanced() ? "YES" : "NO";
                    BigDecimal monthlyPayment = sales.isFinanced() ? contract.getMonthlyPayment() : BigDecimal.valueOf(0.00);

                    writer.write(String.join("|",
                            "SALE",
                            contract.getDate(),
                            contract.getCustomerName(),
                            contract.getCustomerEmail(),
                            String.valueOf(contract.getVehicleSold().getVin()),
                            String.valueOf(contract.getVehicleSold().getYear()),
                            contract.getVehicleSold().getMake(),
                            contract.getVehicleSold().getModel(),
                            contract.getVehicleSold().getVehicleType(),
                            contract.getVehicleSold().getColor(),
                            String.valueOf(contract.getVehicleSold().getOdometer()),
                            String.format("%.2f", contract.getVehicleSold().getPrice()),
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
                            String.valueOf(contract.getVehicleSold().getVin()),
                            String.valueOf(contract.getVehicleSold().getYear()),
                            contract.getVehicleSold().getMake(),
                            contract.getVehicleSold().getModel(),
                            contract.getVehicleSold().getVehicleType(),
                            contract.getVehicleSold().getColor(),
                            String.valueOf(contract.getVehicleSold().getOdometer()),
                            String.format("%.2f", contract.getVehicleSold().getPrice()),
                            String.format("%.2f", contract.getVehicleSold().getPrice() * 0.5),
                            String.format("%.2f", contract.getVehicleSold().getPrice() * 0.07),
                            String.format("%.2f", contract.getTotalPrice()),
                            String.format("%.2f", contract.getMonthlyPayment())
                    ));
                    writer.newLine();
                }

            }
        } catch (IOException e) {
            System.out.println("Unable to save contract to file: " + e.getMessage());
        }
    }
}