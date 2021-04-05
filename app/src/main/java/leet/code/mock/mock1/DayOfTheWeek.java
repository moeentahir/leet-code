package leet.code.mock.mock1;

import java.time.DayOfWeek;
import java.util.Calendar;

class DayOfTheWeek {
    public String dayOfTheWeek(int day, int month, int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(year - 1900, month, day);
        int value = cal.get(Calendar.DAY_OF_WEEK);
        DayOfWeek of = DayOfWeek.of(value);
        return of.name();
    }
}
