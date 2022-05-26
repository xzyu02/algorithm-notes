// 446_Arithmetic_Slices_II-Subsequence

import java.util.HashMap;

class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int len = nums.length;
        int ret = 0;
        HashMap<Long, Integer>[] dp = new HashMap[len];
        for(int i = 0; i < len; i++) dp[i] = new HashMap<>();
        for(int i = 1; i < len; i++) {
            for(int j = 0; j < i; j++) {
                long diff = (long)nums[i] - (long)nums[j];
                // dp[j][diff] denotes the subsequences with same difference that longer than 3
                // j is less than i by 1,
                // because we will store 1 to dp[i][diff], so when we call dp[j][diff],
                // the result actually counts all previous numbers that fits the diff,
                // and the key assumes the current one fits as well,
                // or we won't get anything except 0
                int cnt = dp[j].getOrDefault(diff, 0);
                dp[i].put(diff, dp[i].getOrDefault(diff, 0) + 1 + cnt);
                ret += cnt;
            }
        }
        return ret;
    }
}