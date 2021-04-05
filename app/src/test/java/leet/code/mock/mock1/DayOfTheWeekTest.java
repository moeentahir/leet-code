package leet.code.mock.mock1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DayOfTheWeekTest {

    @Test
    void calculateDateOfTheWeek() {
        String actual = new DayOfTheWeek().dayOfTheWeek(31, 8, 2019);

        assertEquals("Saturday", actual);
    }
}