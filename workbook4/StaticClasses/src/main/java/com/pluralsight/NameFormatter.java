package com.pluralsight;
import java.util.ArrayList;

public class NameFormatter {

    public static String format(String firstName, String lastName) {
        return lastName + " " + firstName;
    }

    public static String format(String prefix, String firstName, String middleName, String lastName, String suffix) {
        return lastName + " " + prefix + " " + firstName + " " + middleName + ", " + suffix;
    }

    public static String format(String fullName) {
            String prefix = "";
            String firstName = "";
            String middleName = "";
            String lastName = "";
            String suffix = "";
            ArrayList<Character> charArray = new ArrayList<>();
            String tempFullName = "";

        for (int i = 0; i < fullName.indexOf(" "); i++) {
            charArray.set(i, fullName.charAt(i));
            prefix += charArray.get(i);
        }

        tempFullName = fullName.replaceAll(prefix, "");

        for (int i = 0; i < tempFullName.indexOf(" "); i++) {
            charArray.set(i, tempFullName.charAt(i));
            firstName += charArray.get(i);
        }

        tempFullName = tempFullName.replaceAll(firstName, "");

        for (int i = 0; i < tempFullName.indexOf(" "); i++) {
            charArray.set(i, tempFullName.charAt(i));
            middleName += charArray.get(i);
        }

        tempFullName = tempFullName.replaceAll(middleName, "");

        for (int i = 0; i < tempFullName.indexOf(","); i++) {
            charArray.set(i, tempFullName.charAt(i));
            lastName += charArray.get(i);
        }

        tempFullName = tempFullName.replaceAll(lastName + ",", "");
        suffix = tempFullName;

        return lastName + " " + prefix + " " + firstName + " " + middleName + ", " + suffix;
    }
}
