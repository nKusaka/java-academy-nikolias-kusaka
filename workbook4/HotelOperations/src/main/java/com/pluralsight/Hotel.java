package com.pluralsight;

public class Hotel {

    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;

    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = 0;
        this.bookedBasicRooms = 0;
    }

    public String getName() {
        return this.name;
    }

    public int getNumberOfRooms() {
        return this.numberOfRooms;
    }

    public int getNumberOfSuites() {
        return this.numberOfSuites;
    }

    public int getBookedSuites() {
        return this.bookedSuites;
    }

    public int getBookedBasicRooms() {
        return this.bookedBasicRooms;
    }

    public boolean bookRoom(int numberOfRooms, boolean isSuite) {
        if (isSuite && this.numberOfSuites - numberOfRooms >= 0) {
            this.numberOfSuites -= numberOfRooms;
            return true;
        }
        else if (!isSuite && this.numberOfRooms - numberOfRooms >= 0) {
            this.numberOfRooms -= numberOfRooms;
            return true;
        } else {
            return false;
        }
    }

    public int getAvailableSuites() {
        return this.numberOfSuites - bookedSuites;
    }

    public int getAvailableRooms() {
        return this.numberOfRooms - bookedBasicRooms;
    }

}
