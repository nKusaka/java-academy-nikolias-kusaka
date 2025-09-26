package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        doubleAge(23);
        Retirement(23);
    }

    public static void doubleAge(int age) {
        System.out.println("Your doubled age is: " + age * 2);

    }

    public static void Retirement(int age) {
        System.out.printf("You have " + (65 - age) + " years until retirement");
    }
}