// 2470. Number of Subarrays With LCM Equal to K

class Solution {
    public int subarrayLCM(int[] nums, int k) {
        int res = 0, n = nums.length;
        for (int i = 0; i < n; i++) {
            int c = 1;
            for (int j = i; j < n; j++) {
                c = lcm(c, nums[j]);
                if (c == k) {
                    res++;
                }
            }
        }
        return res;
    }
    
    private int gcd(int a, int b) {
        if (a == 0) return b;
        return gcd(b % a, a);
    }
    
    private int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}