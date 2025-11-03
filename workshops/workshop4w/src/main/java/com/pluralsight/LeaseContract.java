package com.pluralsight;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class LeaseContract extends Contract {

    private BigDecimal expectedEndingValue;
    private final BigDecimal leaseFee = BigDecimal.valueOf(1.07);

    public LeaseContract(String date, String customerName, String customerEmail, Vehicle vehicleSold) {
        super(date, customerName, customerEmail, vehicleSold);
    }

    @Override
    public BigDecimal getMonthlyPayment() {
        BigDecimal annualRate = new BigDecimal("0.040");
        BigDecimal monthlyRate = annualRate.divide(new BigDecimal("12"), 10, RoundingMode.HALF_UP);
        int months = 36;

        BigDecimal principal = BigDecimal.valueOf(getVehicleSold().getPrice());

        // (1 + r)^n
        BigDecimal onePlusRatePowN = BigDecimal.ONE.add(monthlyRate).pow(months);

        // numerator: P * r * (1 + r)^n
        BigDecimal numerator = principal.multiply(monthlyRate).multiply(onePlusRatePowN);

        // denominator: (1 + r)^n - 1
        BigDecimal denominator = onePlusRatePowN.subtract(BigDecimal.ONE);

        // final monthly payment
        return numerator.divide(denominator, 2, RoundingMode.HALF_UP);
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

    public BigDecimal getExpectedEndingValue() {
        BigDecimal depreciate = BigDecimal.valueOf(0.50);
        return (BigDecimal.valueOf(getVehicleSold().getPrice()).multiply(depreciate));
    }

}
