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

                BigDecimal rate = new BigDecimal("0.0425").divide(new BigDecimal("12"), 10, RoundingMode.HALF_UP);
                int months = 48;

                BigDecimal principal = BigDecimal.valueOf(getVehicleSold().getPrice());

                // (1 + r)
                BigDecimal onePlusRate = BigDecimal.ONE.add(rate);

                // (1 + r)^n
                BigDecimal power = onePlusRate.pow(months);

                // denominator: 1 - (1 + r)^(-n)  ==  1 - 1 / (1 + r)^n
                BigDecimal denominator = BigDecimal.ONE.subtract(BigDecimal.ONE.divide(power, 10, RoundingMode.HALF_UP));

                // M = P * r / (1 - (1 + r)^-n)
                return principal.multiply(rate).divide(denominator, 2, RoundingMode.HALF_UP);

            } else {

                BigDecimal rate = new BigDecimal("0.0525").divide(new BigDecimal("12"), 10, RoundingMode.HALF_UP);
                int months = 24;

                BigDecimal principal = BigDecimal.valueOf(getVehicleSold().getPrice());

                // (1 + r)
                BigDecimal onePlusRate = BigDecimal.ONE.add(rate);

                // (1 + r)^n
                BigDecimal power = onePlusRate.pow(months);

                // denominator: 1 - (1 + r)^(-n)  ==  1 - 1 / (1 + r)^n
                BigDecimal denominator = BigDecimal.ONE.subtract(BigDecimal.ONE.divide(power, 10, RoundingMode.HALF_UP));

                // M = P * r / (1 - (1 + r)^-n)
                return principal.multiply(rate).divide(denominator, 2, RoundingMode.HALF_UP);

            }
        }
    }

    @Override
    public BigDecimal getTotalPrice() {

        if (!isFinanced && getVehicleSold().getPrice() >= 10000) {
            BigDecimal salesTaxAmount = BigDecimal.valueOf(getVehicleSold().getPrice() * 0.05);
            return BigDecimal.valueOf(getVehicleSold().getPrice())
                    .add(BigDecimal.valueOf(100))
                    .add(BigDecimal.valueOf(495))
                    .add(salesTaxAmount);
        }
        else if (!isFinanced && getVehicleSold().getPrice() < 10000) {
            BigDecimal salesTaxAmount = BigDecimal.valueOf(getVehicleSold().getPrice() * 0.05);
            return BigDecimal.valueOf(getVehicleSold().getPrice())
                    .add(BigDecimal.valueOf(100))
                    .add(BigDecimal.valueOf(295))
                    .multiply(BigDecimal.valueOf(1.05));
        } else {
            if (getVehicleSold().getPrice() >= 10000) {
                BigDecimal months = BigDecimal.valueOf(48);
                BigDecimal salesTax = BigDecimal.valueOf(1.05);
                BigDecimal recordingFee = BigDecimal.valueOf(100);
                BigDecimal processingFee = BigDecimal.valueOf(495);

                return getMonthlyPayment()
                        .multiply(months)
                        .multiply(salesTax)
                        .add(recordingFee)
                        .add(processingFee);
            } else {
                BigDecimal months = BigDecimal.valueOf(24);
                BigDecimal salesTax = BigDecimal.valueOf(1.05);
                BigDecimal recordingFee = BigDecimal.valueOf(100);
                BigDecimal processingFee = BigDecimal.valueOf(295);

                return getMonthlyPayment()
                        .multiply(months)
                        .multiply(salesTax)
                        .add(recordingFee)
                        .add(processingFee);
            }
        }
    }

    public boolean isFinanced() {
        return this.isFinanced;
    }
}
