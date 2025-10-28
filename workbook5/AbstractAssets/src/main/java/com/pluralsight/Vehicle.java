package com.pluralsight;

public class Vehicle extends Asset {

    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);

        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;

    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public double getValue() {
        int age = 2025 - getYear();
        double value = getOriginalCost();

        switch(age) {
            case 0, 1, 2, 3 -> value = value * (1 - age * 0.03);
            case 4, 5, 6 -> value = value * (1 - age * 0.06);
            case 7, 8, 9, 10 -> value = value * (1 - age * 0.08);
            default -> value = 1000;
        }

        if (odometer > 100000 && !makeModel.toLowerCase().contains("honda") || !makeModel.toLowerCase().contains("toyota")) {
            value = value * 3/4;
        }

        return value;
    }
}
