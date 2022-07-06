// 509. Fibonacci Number

class Solution {
    public int fib(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1;
        int res = n;
        while(res-- > 1) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }
}