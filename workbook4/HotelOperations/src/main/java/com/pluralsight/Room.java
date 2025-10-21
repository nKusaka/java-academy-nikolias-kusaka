package com.pluralsight;

public class Room {

    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;
    private boolean isAvailable;

    public Room(int numberOfBeds, double price, boolean isDirty, boolean isOccupied, boolean isAvailable) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isDirty = isDirty;
        this.isOccupied = isOccupied;
        this.isAvailable = isAvailable;
    }

    public Room() {
        this.isOccupied = false;
        this.isDirty = false;
        this.isAvailable = true;
    }

    public int getNumberOfBeds() {
        return this.numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        this.isOccupied = occupied;
    }

    public boolean isDirty() {
        return this.isDirty;
    }

    public void setDirty(boolean dirty) {
        this.isDirty = dirty;
    }

    public boolean isAvailable() {
        return this.isAvailable;
    }

    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    public void checkIn() {
        this.isAvailable = false;
        this.isOccupied = true;
        this.isDirty = true;
    }

    public void checkOut() {
        cleanroom();
        this.isAvailable = true;
        this.isOccupied = false;
    }

    public void cleanroom() {
        this.isDirty = false;
    }
}
