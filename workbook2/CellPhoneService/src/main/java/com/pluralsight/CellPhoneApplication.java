package com.pluralsight;
import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        CellPhoneApplication cellPhone1 = new CellPhoneApplication();
        CellPhoneApplication cellPhone2 = new CellPhoneApplication(71231, "IPhone 16 Pro Max", "Verizon", "7076125823", "Jake");

        Scanner read = new Scanner(System.in);

        System.out.printf("What is the serial number? ");
        int serialNumber = read.nextInt();
        cellPhone.setSerialNumber(serialNumber);
        read.nextLine();

        System.out.printf("What model is the phone? ");
        String model = read.nextLine();
        cellPhone.setModel(model);

        System.out.printf("Who is the carrier? ");
        String carrier = read.nextLine();
        cellPhone.setCarrier(carrier);

        System.out.printf("What is the phone number? ");
        String phoneNumber = read.nextLine();
        cellPhone.setPhoneNumber(phoneNumber);

        System.out.printf("Who is the owner of the phone? ");
        String owner = read.nextLine();
        cellPhone.setOwner(owner);

        System.out.println();
        System.out.println("Serial Number: " + cellPhone.getSerialNumber());
        System.out.println("Model: " + cellPhone.getModel());
        System.out.println("Carrier: " + cellPhone.getCarrier());
        System.out.println("Phone Number: " + cellPhone.getPhoneNumber());
        System.out.println("Owner: " + cellPhone.getOwner());

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
