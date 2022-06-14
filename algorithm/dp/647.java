// 647. Palindromic Substrings

class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        int count = 0;
        for (int d = 0; d < n; d++) {
            for (int i = 0; i + d < n; i++) {
                int j = i + d;
                if (s.charAt(i) == s.charAt(j)) {
                    if (j == i || (j == i + 1)) {
                        dp[i][j] = 1;
                    } else {
                        dp[i][j] = dp[i+1][j-1]; 
                    }
                    count += dp[i][j];
                }
            }
        }
        return count;
    }
}

