package NextDayCalculator;

public class NextDayCalculator {
    public static String findNextDay(int currentDay, int currentMonth, int currentYear) {
        int[] daysInEachMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (isLeapYear(currentYear)) {
            daysInEachMonth[1] = 29; // tháng 2 có 29 ngày
        }

        int nextDay = currentDay + 1;
        int nextMonth = currentMonth;
        int nextYear = currentYear;

        if (nextDay > daysInEachMonth[currentMonth - 1]) {
            nextDay = 1;
            nextMonth++;
        }

        if (nextMonth > 12) {
            nextMonth = 1;
            nextYear++;
        }

        return String.format("%02d/%02d/%d", nextDay, nextMonth, nextYear);
    }

    private static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }
}
