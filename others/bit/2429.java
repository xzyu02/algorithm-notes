// 2429. Minimize XOR

class Solution {
    public int minimizeXor(int num1, int num2) {
        int a = Integer.bitCount(num1), b = Integer.bitCount(num2);
        int res = num1;
        // rules of xor :1^1 = 0, 1^0 = 1, 0^1 = 1, 0^0 = 0
        for (int i = 0; i < 32; i++) {
            // we need reduce a - b bits to make res close to a
            if (a > b && ((1 << i) & num1) > 0) {
                // test if current bit in num1 is 1
                res ^= (1 << i); // then delete current bit
                a--;
            }
            // add b - a bits to make res close to a
            if (a < b && ((1 << i) & num1) == 0) {
                // if num1 at bit i is 0
                res ^= (1 << i); // then add bit at this position
                a++;
            }
        }
        return res;
    }
    
}