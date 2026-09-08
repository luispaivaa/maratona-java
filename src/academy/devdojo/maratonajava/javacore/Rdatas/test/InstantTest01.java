package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class InstantTest01 {
    public static void main(String[] args) {
        // NANOSSEGUNDOS
        // ZULU TIME - UTC
        // HORÁRIO NEUTRO

         Instant now = Instant.now();
         System.out.println(now);
         System.out.println(LocalDateTime.now());
        System.out.println(now.getEpochSecond());
        System.out.println(now.getNano());
        System.out.println(Instant.ofEpochSecond(10));
        System.out.println(Instant.ofEpochSecond(10, 111));
        System.out.println(Instant.ofEpochSecond(14, 0));
        System.out.println(Instant.ofEpochSecond(14, 1_000_000));
        System.out.println(Instant.ofEpochSecond(14, -1_000_000));
    }
}
