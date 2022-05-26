// 32. Longest Valid Parentheses

class Solution {
    public int longestValidParentheses(String s) {
        int n = s.length();
        if (n == 0) return 0;
        int[] dp = new int[n]; 
        int left = 0, max = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(') {
                left++;
            } else if (left > 0) {
                dp[i] = dp[i-1] + 2;
                dp[i] += (i-dp[i] >= 0) ? dp[i-dp[i]] : 0;
                max = Math.max(max, dp[i]);
                left--;
            }
        }
        return max;
    }
}