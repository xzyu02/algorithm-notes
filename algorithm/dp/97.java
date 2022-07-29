// 97. Interleaving String

class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length()) return false; // base case
        int n = s1.length(), m = s2.length();
        boolean[][] dp = new boolean[n+1][m+1];
        dp[0][0] = true;
        // initialize s1 column
        for (int i = 1; i <= n; i++)
            dp[i][0] = dp[i-1][0] && (s1.charAt(i-1) == s3.charAt(i-1));
        // initialize s2 row
        for (int i = 1; i <= m; i++)
            dp[0][i] = dp[0][i-1] && (s2.charAt(i-1) == s3.charAt(i-1));
        // dp
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                char c1 = s1.charAt(i-1);
                char c2 = s2.charAt(j-1);
                char c3 = s3.charAt(i+j-1);
                dp[i][j] = (c1 == c3 && dp[i-1][j]) || (c2 == c3 && dp[i][j-1]);
            }
        }
        return dp[n][m];
    }
}