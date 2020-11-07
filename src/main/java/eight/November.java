package eight;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Set;

import static java.time.DayOfWeek.*;

public class November {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2018, 11, 1);
        LocalDate endDate = LocalDate.of(2018, 12, 1);

        final Set<LocalDate> holidays = Set.of(
                LocalDate.of(2018, 11, 11)
        );

        final Set<DayOfWeek> weekdays = Set.of(
                MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY
        );

        startDate.datesUntil(endDate)
                .forEach(element -> {
                    if (weekdays.contains(element.getDayOfWeek())) {
                        System.out.println(element + " workday");
                    } else if (holidays.contains(element)) {
                        System.out.println(element + " Polish holiday");
                    } else {
                        System.out.println(element + " free day");
                    }
                });
    }
}

