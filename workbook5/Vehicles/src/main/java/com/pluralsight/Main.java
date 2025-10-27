package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Moped slowRide = new Moped("Red", 5,5,5);

        System.out.println(slowRide.getColor() + " " + slowRide.getFuelCapacity());
    }
}