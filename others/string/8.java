// 8. String to Integer (atoi)

class Solution {
    public int myAtoi(String s) {
        s = s.stripLeading();
        if (s.isEmpty()) {
            return 0;
        }
        int base = 0, i = 0, sign = 1;
        if (s.charAt(i) == '-' || s.charAt(i) == '+') {
            sign = s.charAt(i++) == '-' ? -1 : 1;
        }
        while(i < s.length() && Character.isDigit(s.charAt(i))) {
            // oveflow
            if (base > Integer.MAX_VALUE / 10 || (base == Integer.MAX_VALUE / 10 && s.charAt(i) - '0' > Integer.MAX_VALUE % 10)) {
                return (sign == -1) ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            base = base * 10 + (s.charAt(i++) - '0');
        }
        return base * sign;

    }
}