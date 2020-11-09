package eight;

import java.time.LocalDate;
import java.util.Set;

import static java.time.DayOfWeek.*;
import static java.time.LocalDate.of;

public class November {
    public static void main(String[] args) {
        var startDate = of(2018, 11, 1);
        var endDate = of(2018, 12, 1);

        final Set<LocalDate> holidays = Set.of(
                of(2018, 11, 1),
                of(2018, 11, 11)
        );

        final var weekdays = Set.of(
                MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY
        );

        startDate.datesUntil(endDate)
                .forEach(element -> {
                    if (holidays.contains(element)) {
                        System.out.println(element + " Polish holiday");
                    } else if (weekdays.contains(element.getDayOfWeek())) {
                        System.out.println(element + " workday");
                    } else {
                        System.out.println(element + " free day");
                    }
                });
    }
}
