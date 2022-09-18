// 2413. Smallest Even Multiple

class Solution {
    public int smallestEvenMultiple(int n) {
        return (n % 2 == 0) ? n : 2*n;
    }
}

class Solution {
    public int smallestEvenMultiple(int n) {
        return n << (n & 1);
    }
}