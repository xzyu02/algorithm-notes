// 1360. Number of Days Between Two Dates

class Solution {
    int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public int daysBetweenDates(String date1, String date2) {
        return Math.abs(daysFrom1971(date1) - daysFrom1971(date2));
    }
    
    public int daysFrom1971(String date) {
        String[] strs = date.split("-");
        int y = Integer.parseInt(strs[0]);
        int m = Integer.parseInt(strs[1]);
        int d = Integer.parseInt(strs[2]);
        for(int yy = 1971; yy < y; yy++) {
            d += isLeap(yy) ? 366 : 365;
        }
        for(int i = 0; i < m - 1; i++) {
            d += days[i];
        }
        d += (m > 2 && isLeap(y)) ? 1 : 0;
        return d;
    }
    
    private boolean isLeap(int y) {
        return y % 400 == 0 || (y % 100 != 0 && y % 4 == 0);
    }
}