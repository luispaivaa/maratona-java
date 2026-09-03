package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate date = LocalDate.of(2026, Month.DECEMBER, 25);
        LocalTime time = LocalTime.of(14,45,00);
        LocalDate date2 = LocalDate.parse("2026-12-27");
        LocalTime time2 = LocalTime.parse("14:40");

        System.out.println("Data hora agora -> " + localDateTime);
        System.out.println(localDateTime.getHour());

        System.out.println(date2);
        System.out.println(time2);

        LocalDateTime ldt1 = date2.atTime(time2); //junção
        LocalDateTime ldt2 = time.atDate(date2); //junção
        System.out.println(ldt1);
        System.out.println(ldt2);
    }
}
