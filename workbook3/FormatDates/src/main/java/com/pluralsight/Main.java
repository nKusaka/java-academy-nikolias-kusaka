package com.pluralsight;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatterBuilder;

public class Main {
    public static void main(String[] args) {

        // Create date time formatter and localdatetime object as well as
        // string to hold date and time
        LocalDate dateToday = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedDate = dateToday.format(formatter);

        // Output date and time
        System.out.println(formattedDate);
        System.out.println(dateToday);


    }
}