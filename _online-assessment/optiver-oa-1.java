class solution {
    static int[] daysList = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    static int DaysBetween(int year1, int month1, int day1, int year2, int month2, int day2) throws Exception {
        return Math.abs(daysFromYear(year1, month1, day1) - daysFromYear(year2, month2, day2));
    }

    static int daysFromYear(int y, int m, int d) {
        int days = d;
        for (int yy = 1970; yy < y; yy++) {
            days += isLeap(yy) ? 366 : 365;
        }
        for (int mm = 0; mm < m - 1; mm++) {
            days += daysList[mm];
        }
        if (m > 2 && isLeap(y)) {
            days += 1;
        }
        return days;
    }

    static boolean isLeap(int y) {
        return (y % 4 == 0 && y % 100 != 0) || y % 400 == 0;
    }
}