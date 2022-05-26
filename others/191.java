// 191. Number of 1 Bits

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int ones = 0;
        while(n != 0) {
            ones += (n & 1);
            // bit shifting unsigned operation >>>, while >> depends on sign extension
            n = n >>> 1;
        }
        return ones;
    }
}