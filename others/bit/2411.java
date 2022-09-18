// 2411. Smallest Subarrays With Maximum Bitwise OR

class Solution {
    public int[] smallestSubarrays(int[] nums) {
        int n = nums.length;
        int[] bitIdx = new int[30];
        int[] res = new int[n];
        for(int i = n - 1; i >= 0; i--) {
            res[i] = 1;
            for(int j = 0; j < 30; j++) {
                if ((nums[i] >> j & 1) == 1) {
                    bitIdx[j] = i;
                }
                res[i] = Math.max(res[i], bitIdx[j] - i + 1);
            }
        }
        return res;
    }
}