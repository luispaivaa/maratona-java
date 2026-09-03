package academy.devdojo.maratonajava.javacore.Qstring.explain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate myDateObj = LocalDate.now(); // create a date object
        System.out.println("Format yyyy-MM-dd " + myDateObj);

        LocalTime myTimeObj = LocalTime.now();
        System.out.println("Format HH-mm-ss-ns " + myTimeObj);

        LocalDateTime myDateTimeObj = LocalDateTime.now();
        System.out.println(myDateTimeObj);

        LocalDateTime myDateTimeObj2 = LocalDateTime.now();
        System.out.println("Before formatting: " + myDateTimeObj2);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        try {
            String formattedDate = myDateObj.format(myFormatObj);
            System.out.println("After formatting: " + formattedDate);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }

    }
}
