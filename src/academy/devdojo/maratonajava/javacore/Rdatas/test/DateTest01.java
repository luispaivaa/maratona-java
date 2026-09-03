package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        Date date = new Date(1788200806196L); //long 100000
        Date date2 = new Date();
        System.out.println(date2);
        date.setTime(date.getTime() + 3_600_000);
        System.out.println(date);
    }
}
