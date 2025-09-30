package com.pluralsight;
import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {

        //Creating variables out of classes like scanner and stringbuilder for user input and dynamic mutable strings.
        Scanner read = new Scanner(System.in);
        StringBuilder shippingAddress = new StringBuilder();
        StringBuilder billingAddress = new StringBuilder();

        System.out.printf("Name: ");
        String fullName = read.nextLine();
        billingAddress = billingAddress(read);
        shippingAddress = shippingAddress(read);

        System.out.println("\n" + fullName + "\n");
        System.out.println(billingAddress);
        System.out.println(shippingAddress);

    }

    public static StringBuilder billingAddress(Scanner read) {
        StringBuilder billingAddress = new StringBuilder();
        billingAddress.append("Billing Address: \n");

        System.out.printf("Billing Street: ");
        billingAddress.append(read.nextLine());
        billingAddress.append("\n");

        System.out.printf("Billing City: ");
        billingAddress.append(read.nextLine());
        billingAddress.append(", ");

        System.out.printf("Billing State: ");
        billingAddress.append(read.nextLine());
        billingAddress.append(" ");

        System.out.printf("Billing Zip: ");
        billingAddress.append(read.nextLine());
        billingAddress.append("\n");
        System.out.println();
        return billingAddress;
    }

    public static StringBuilder shippingAddress(Scanner read) {
        StringBuilder shippingAddress = new StringBuilder();
        shippingAddress.append("Shipping Address: \n");

        System.out.printf("Shipping Street: ");
        shippingAddress.append(read.nextLine());
        shippingAddress.append("\n");

        System.out.printf("Shipping City: ");
        shippingAddress.append(read.nextLine());
        shippingAddress.append(", ");

        System.out.printf("Shipping State: ");
        shippingAddress.append(read.nextLine());
        shippingAddress.append(" ");

        System.out.printf("Shipping Zip: ");
        shippingAddress.append(read.nextLine());
        shippingAddress.append("\n");

        return shippingAddress;
    }
}