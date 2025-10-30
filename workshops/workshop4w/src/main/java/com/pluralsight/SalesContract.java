package com.pluralsight;
import java.math.*;
public class SalesContract extends Contract {

    private final BigDecimal salesTaxAmount = new BigDecimal("1.05");
    private final BigDecimal recordingFee = new BigDecimal("100.00");
    boolean isFinanced;

    public SalesContract(String date, String customerName, String customerEmail, Vehicle vehicleSold, boolean isFinanced) {
        super(date, customerName, customerEmail, vehicleSold);
        this.isFinanced = isFinanced;
    }

    @Override
    public BigDecimal getMonthlyPayment() {
        if (!isFinanced) {
            return new BigDecimal("0");
        } else {
            if (getVehicleSold().getPrice() >= 10000) {
                BigDecimal rate = new BigDecimal("0.0425")
                        .divide(new BigDecimal("12"));
            } else {

            }
        }
    }

    @Override
    public BigDecimal getTotalPrice() {

    }

    @Override
    public void displayContract() {

    }
}
