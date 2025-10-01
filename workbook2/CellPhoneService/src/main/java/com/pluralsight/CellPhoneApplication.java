package com.pluralsight;
import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        CellPhoneApplication cellPhone1 = new CellPhoneApplication(72311, "IPhone 16 Pro Max", "Verizon", "7073721580", "Nik");
        CellPhoneApplication cellPhone2 = new CellPhoneApplication(71231, "IPhone 16 Pro Max", "Verizon", "7076125823", "Jake");

        display(cellPhone1);
        display(cellPhone2);
    }

    public static void display(CellPhoneApplication phone) {
        System.out.println();
        System.out.println("Serial Number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getOwner());

    }

    public CellPhoneApplication() {
        serialNumber = 0;
        model = "";
        carrier = "";
        phoneNumber = "";
        owner = "";
    }
    public CellPhoneApplication(int serialNumber, String model, String carrier, String phoneNumber, String owner) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.owner = owner;
    }

    public int getSerialNumber() {
        return this.serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarrier() {
        return this.carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOwner() {
        return this.owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void dial(String phoneNumber) {
        System.out.println(this.owner + "'s phone is calling " + phoneNumber);
    }

    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;
}
