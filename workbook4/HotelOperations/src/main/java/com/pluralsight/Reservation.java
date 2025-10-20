package com.pluralsight;

public class Reservation {

    private String roomType;
    private double price;
    private int numberOfNights;
    private boolean isWeekend;
    private double reservationTotal;

    public Reservation(String roomType, double price, int numberOfNights, double reservationTotal, boolean isWeekend) {
        this.roomType = roomType;
        this.price = price;
        this.numberOfNights = numberOfNights;
        this.reservationTotal = reservationTotal;
        this.isWeekend = isWeekend;
    }

    public Reservation() {

    }

    public String getRoomType() {
        return this.roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        return this.price;
    }

    public boolean isWeekend() {
        return this.isWeekend;
    }

    public void setWeekend(boolean weekend) {
        this.isWeekend = weekend;
    }

    public int getNumberOfNights() {
        return this.numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public double getReservationTotal() {
       if (this.roomType.equalsIgnoreCase("king")) {
           return 139.00 * this.getNumberOfNights();
       } else {
           return 124.00 * this.getNumberOfNights();
       }
    }

}
