// 29. Divide Two Integers

class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == 1 << 31 && divisor == -1) return Integer.MAX_VALUE; // 1 << 31 - 1
        int absDividend = Math.abs(dividend), absDivisor = Math.abs(divisor);
        int result = 0, a = 0;
        while (absDividend - absDivisor >= 0) {
            a = 0;
            while (absDividend - (absDivisor << a << 1) >= 0)
                a++;
            result += 1 << a;
            absDividend -= absDivisor << a;
        }
        return (dividend < 0 ^ divisor < 0) ? -result : result;
    }
}