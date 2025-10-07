package com.pluralsight;
import java.time.*;
import java.time.format.DateTimeFormatter;


public class Main {
    public static void main(String[] args) {

        // Create date time formatter and localdatetime object as well as
        // string to hold date and time
        LocalDate dateToday = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedDate = dateToday.format(formatter);

        // Output date in different formats in PST
        System.out.println(formattedDate);
        System.out.println(dateToday);

        // Output date in format MMMM dd, yyyy in PST
        formatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
        formattedDate = dateToday.format(formatter);
        System.out.println(formattedDate);

        // Output date and time in GMT
        ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy  HH:mm");
        formattedDate = gmtTime.format(dateTimeFormatter);
        System.out.println(formattedDate);

        // Output date and time in PST
        LocalDateTime today = LocalDateTime.now();
        dateTimeFormatter = DateTimeFormatter.ofPattern("H:mm 'on' dd-MMM-yyyy");
        formattedDate = today.format(dateTimeFormatter);
        System.out.println(formattedDate);


    }
}