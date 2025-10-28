package com.pluralsight;

public class House extends Asset {
    String address;
    int condition;
    int squareFoot;
    int lotSize;


    public House(String description, String dateAcquired, double originalCost, String address, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;

        if (originalCost / squareFoot >= 180.00) {
            condition = 1;
        } else if (originalCost / squareFoot >= 130) {
            condition = 2;
        } else if (originalCost / squareFoot >= 90) {
            condition = 3;
        } else if (originalCost / squareFoot <= 80) {
            condition = 4;
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    @Override
    public double getValue() {
        return getOriginalCost() / squareFoot + (0.25 * lotSize);
    }
}
