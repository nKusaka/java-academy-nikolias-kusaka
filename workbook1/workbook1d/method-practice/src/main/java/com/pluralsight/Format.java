package com.pluralsight;

public class Format {
    public static void main(String[] args) {
        System.out.println(formatName("Nikolias", "Kusaka"));
    }

    // Creating a new method that requires string parameters to be passed in
    public static String formatName(String first, String last) {
        String format = last + ' ' + first;
        return format;
    }
}
