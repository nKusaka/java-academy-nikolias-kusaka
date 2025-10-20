package com.pluralsight;
import java.time.*;
import java.time.format.*;

public class Employee {

    private LocalTime startTime;
    private LocalTime endTime;
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public Employee() {

    }

    public int getEmployeeId() {
        return this.employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return this.payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return this.hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getTotalPay() {
        return this.hoursWorked * this.payRate;
    }

    public double getRegularHours() {
        if (this.hoursWorked > 40) {
            return 40;
        } else {
            return this.hoursWorked;
        }
    }

    public double getOvertimeHours() {
        if (this.hoursWorked > 40) {
            return this.hoursWorked - 40;
        } else {
            return 0;
        }
    }

    public void punchIn(double time) {
        this.hoursWorked += time;
    }

    public void punchOut(double time) {
        this.hoursWorked += time;
    }

    public void punchIn() {
        this.startTime = LocalTime.now();
    }

    public void punchOut() {

        this.endTime = LocalTime.now();
        Duration diff = Duration.between(startTime, endTime);

        double hours = diff.toHours();

        this.hoursWorked += hours;

    }
}
