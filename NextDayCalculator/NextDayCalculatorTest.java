package NextDayCalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    void shouldReturnNextDayWithinSameMonth() {
        assertEquals("02/01/2018", NextDayCalculator.findNextDay(1, 1, 2018));
    }

    @Test
    void shouldReturnFirstOfNextMonth() {
        assertEquals("01/02/2018", NextDayCalculator.findNextDay(31, 1, 2018));
    }

    @Test
    void shouldHandleThirtyDayMonth() {
        assertEquals("01/05/2018", NextDayCalculator.findNextDay(30, 4, 2018));
    }

    @Test
    void shouldHandleNonLeapYearFebruary() {
        assertEquals("01/03/2018", NextDayCalculator.findNextDay(28, 2, 2018));
    }

    @Test
    void shouldHandleLeapYearFebruary() {
        assertEquals("01/03/2020", NextDayCalculator.findNextDay(29, 2, 2020));
    }

    @Test
    void shouldHandleNewYear() {
        assertEquals("01/01/2019", NextDayCalculator.findNextDay(31, 12, 2018));
    }
}