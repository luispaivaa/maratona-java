package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationTest01 {
    public static void main(String[] args) {

        // mede tempo em segundos, milisegundos, minutos e horas.
        // nao aceita LocalDate.
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = now.plusYears(2);
        LocalTime localTime = LocalTime.now();
        LocalTime timeMinus7hours = LocalTime.now().minusHours(7);


        // diferença de tempo entre dois instantes de tempo
        Duration d1 = Duration.between(now, nowAfterTwoYears);
        Duration d2 = Duration.between(localTime, timeMinus7hours);
        Duration d3 = Duration.between(Instant.now(), Instant.now().plusSeconds(10000));
        Duration d4 = Duration.ofDays(4);
        Duration d5 = Duration.ofMinutes((3));
        Duration d6 = Duration.of(3, ChronoUnit.DAYS);

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);
        System.out.println(d6);
    }
}
