package com.pluralsight;
import java.util.ArrayList;

public class NameFormatter {

    public static String format(String firstName, String lastName) {
        return lastName + ", " + firstName;
    }

    public static String format(String prefix, String firstName, String middleName, String lastName, String suffix) {
        return lastName + ", " + prefix + " " + firstName + " " + middleName + ", " + suffix;
    }

    public static String format(String fullName) {
        String[] parts = fullName.split(" ");

        switch (parts.length) {
            case 5:
                return parts[3] + " " + parts[0] + " " + parts [1] + " " + parts[2] + ", " + parts[4];
            case 4:
                return parts[2] + " " + parts[0] + " " + parts[1] + ", " + parts[3];
            case 2:
                return parts[1] + ", " + parts[0];
        }
        return "invalid name format";
    }
}
