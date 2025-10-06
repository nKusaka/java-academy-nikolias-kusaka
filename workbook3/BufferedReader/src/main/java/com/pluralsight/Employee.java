package com.pluralsight;

public class Employee {

    // Instance variables
    private int employeeID;
    private String name;
    private float hoursWorked;
    private float payRate;

    // Constructor
    public Employee(int employeeID, String name, float hoursWorked, float payRate) {
        this.employeeID = employeeID;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;

    }

    // Setters
    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHoursWorked(float hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void setPayRate(float payRate) {
        this.payRate = payRate;
    }

    // Getters
    public int getEmployeeID() {
        return this.employeeID;
    }

    public String getName() {
        return this.name;
    }

    public float getHoursWorked() {
        return this.hoursWorked;
    }

    public float getPayRate() {
        return this.payRate;
    }
}
