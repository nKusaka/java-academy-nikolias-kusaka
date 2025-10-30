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

    }

    @Override
    public BigDecimal getTotalPrice() {

    }
}
