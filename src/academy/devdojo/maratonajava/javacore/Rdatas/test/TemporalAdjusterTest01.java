package academy.devdojo.maratonajava.javacore.Rdatas.test;


import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.*;

class ObterProximoDiaUtil implements TemporalAdjuster {

    @Override
    public Temporal adjustInto(Temporal temporal) {
        DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
        int addDays;
        switch (dayOfWeek) {
            case FRIDAY:
                addDays = 3;
                break;
            case SATURDAY:
                addDays = 2;
                break;
            default:
                addDays = 1;
                break;

        }

        return temporal.plus(addDays, ChronoUnit.DAYS);
    }
}


public class TemporalAdjusterTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(new ObterProximoDiaUtil());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        System.out.println("))))))))))))))))))))))))))))))))");
        LocalDate teste = LocalDate.now().plusDays(4);
        System.out.println(nextDayWeek(teste));
    }

    public static DayOfWeek nextDayWeek(LocalDate localDate) {
        LocalDate newDate;
        if (localDate.getDayOfWeek().getValue() < 4) {
            newDate = localDate.plusDays(1);
        } else {
            newDate = localDate.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        }
        return newDate.getDayOfWeek();
    }
}
