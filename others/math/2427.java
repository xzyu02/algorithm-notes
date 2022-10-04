// 2427. Number of Common Factors

class Solution {
    public int commonFactors(int a, int b) {
        int n = gcd(a, b);
        int num = 0;
        for(int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                // check if divisors are equal
                if (n / i == i) {
                    num += 1;
                } else {
                    num += 2;
                }
            }
        }
        return num;
    }
    
    public int gcd(int a, int b) {
        if (a == 0) return b;
        return gcd(b % a, a);
    }
}