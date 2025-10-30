package com.pluralsight;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class LeaseContract extends Contract {

    private BigDecimal expectedEndingValue;
    private final BigDecimal leaseFee = BigDecimal.valueOf(1.07);

    public LeaseContract(String date, String customerName, String customerEmail, Vehicle vehicleSold, boolean isFinanced) {
        super(date, customerName, customerEmail, vehicleSold);
    }

    @Override
    public BigDecimal getMonthlyPayment() {

        BigDecimal rate = new BigDecimal("0.040").divide(new BigDecimal("36"), 10, RoundingMode.HALF_UP);
        int months = 36;

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

    @Override
    public BigDecimal getTotalPrice() {

        BigDecimal months = BigDecimal.valueOf(36);
        BigDecimal salesTax = BigDecimal.valueOf(1.07);
        BigDecimal leaseFee = (BigDecimal.valueOf(getVehicleSold().getPrice()).multiply(BigDecimal.valueOf(0.070)));

        return getMonthlyPayment()
                .multiply(months)
                .multiply(salesTax)
                .add(leaseFee);
    }

    public BigDecimal expectedEndingValue() {
        BigDecimal depreciate = BigDecimal.valueOf(0.50);
        return (BigDecimal.valueOf(getVehicleSold().getPrice()).multiply(depreciate));
    }



}
