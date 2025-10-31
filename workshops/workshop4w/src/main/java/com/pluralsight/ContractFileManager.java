package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.math.*;

public class ContractFileManager {

    /* Saves the contracts to contracts.csv with formatting
    CONTRACT TYPE|DATE|NAME|EMAIL|VIN|VEHICLE YEAR|MAKE|MODEL|VEHICLE TYPE|COLOR|ODOMETER|PRICE
     */
    public void saveContract(Contract contract, Vehicle vehicle) {

            /* Sales Contract SPECIFIC ENDER
            ...|PRICE|SALES TAX|RECORDING FEE|PROCESSING FEE|TOTAL PRICE|FINANCE OPTION|MONTHLY PAYMENT
            */
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("contracts.csv", true))) {

                if (contract instanceof SalesContract && vehicle.getPrice() > 10000 && ((SalesContract) contract).isFinanced) {
                    bufferedWriter.write("SALE" + "|" + contract.getDate() + "|" + contract.getCustomerName() + "|" + contract.getCustomerEmail() + "|" + vehicle.getVin() + "|" +
                            vehicle.getYear() + "|" + vehicle.getMake() + "|" + vehicle.getModel() + "|" + vehicle.getVehicleType() + "|" +
                            vehicle.getColor() + "|" + vehicle.getOdometer() + "|" + String.format("%.2f", vehicle.getPrice()) + "|" + String.format("%.2f", vehicle.getPrice() * 0.05) + "|" +
                            100.00 + "|" + 495 + "|" + String.format("%.2f", contract.getTotalPrice()) + "|" + "YES" + "|" + String.format("%.2f", contract.getMonthlyPayment()) + "\n");
                }
                else if (contract instanceof SalesContract && vehicle.getPrice() > 10000 && !((SalesContract) contract).isFinanced) {

                        bufferedWriter.write("SALE" + "|" + contract.getDate() + "|" + contract.getCustomerName() + "|" + contract.getCustomerEmail() + "|" + vehicle.getVin() + "|" +
                                vehicle.getYear() + "|" + vehicle.getMake() + "|" + vehicle.getModel() + "|" + vehicle.getVehicleType() + "|" +
                                vehicle.getColor() + "|" + vehicle.getOdometer() + "|" + String.format("%.2f", vehicle.getPrice()) + "|" + vehicle.getPrice()*0.05 + "|" +
                                100.00 + "|" + 495 + "|" + String.format("%.2f", contract.getTotalPrice()) + "|" + "NO" + "|" + 0.00 + "\n");
                }
                else if (contract instanceof SalesContract && vehicle.getPrice() < 10000 && ((SalesContract) contract).isFinanced) {

                        bufferedWriter.write("SALE" + "|" + contract.getDate() + "|" + contract.getCustomerName() + "|" + contract.getCustomerEmail() + "|" + vehicle.getVin() + "|" +
                                vehicle.getYear() + "|" + vehicle.getMake() + "|" + vehicle.getModel() + "|" + vehicle.getVehicleType() + "|" +
                                vehicle.getColor() + "|" + vehicle.getOdometer() + "|" + String.format("%.2f", vehicle.getPrice()) + "|" + String.format("%.2f", vehicle.getPrice()*0.05) + "|" +
                                100.00 + "|" + 295.00 + "|" + String.format("%.2f", contract.getTotalPrice()) + "|" + "YES" + "|" + String.format("%.2f", contract.getMonthlyPayment()) + "\n");
                }
                else if (contract instanceof SalesContract && vehicle.getPrice() < 10000 && !((SalesContract) contract).isFinanced) {

                        bufferedWriter.write("SALE" + "|" + contract.getDate() + "|" + contract.getCustomerName() + "|" + contract.getCustomerEmail() + "|" + vehicle.getVin() + "|" +
                                vehicle.getYear() + "|" + vehicle.getMake() + "|" + vehicle.getModel() + "|" + vehicle.getVehicleType() + "|" +
                                vehicle.getColor() + "|" + vehicle.getOdometer() + "|" + String.format("%.2f", vehicle.getPrice()) + "|" + String.format("%.2f", vehicle.getPrice()*0.05) + "|" +
                                100.00 + "|" + 295 + "|" + String.format("%.2f", contract.getTotalPrice()) + "|" + "NO" + "|" + 0.00 + "\n");
                }
                /* Lease Contract SPECIFIC ENDER
                ...|PRICE|EXPECTED ENDING VALUE|LEASE FEE|TOTAL PRICE|MONTHLY PAYMENT
                */
                if (contract instanceof LeaseContract) {

                    bufferedWriter.write("LEASE" + "|" + contract.getDate() + "|" + contract.getCustomerName() + "|" + contract.getCustomerEmail() + "|" + vehicle.getVin() + "|" +
                            vehicle.getYear() + "|" + vehicle.getMake() + "|" + vehicle.getModel() + "|" + vehicle.getVehicleType() + "|" +
                            vehicle.getColor() + "|" + vehicle.getOdometer() + "|" + String.format("%.2f", vehicle.getPrice()) + "|" + String.format("%.2f", vehicle.getPrice() * 0.5) + "|" +
                            String.format("%.2f", vehicle.getPrice() * 0.07) + "|" + String.format("%.2f", contract.getTotalPrice()) + "|" + String.format("%.2f", contract.getMonthlyPayment()) + "\n");
                }
        } catch (IOException e) {
                System.out.println("Unable to save inventory/dealership list to file");
            }
    }
}
