// 629. K Inverse Pairs Array
class Solution {
    public int kInversePairs(int n, int k) {
        // edge cases
        int maxPairs = n*(n-1)/2;
        if (k < 0 || k > maxPairs) return 0;
        if (k == 0 || k == maxPairs) return 1;
        if (k == 1 || k == maxPairs-1) return n-1;
        // initialize
        int mod = 1000_000_007;
        int[][] dp = new int[n+1][k+1];
        dp[2][0] = 1;
        dp[2][1] = 1;
        for(int i = 3; i <= n; i++) {
            dp[i][0] = 1;
            for(int j = 1; j <= Math.min(k, i*(i-1)/2); j++) {
                //dp[n][k] = dp[n-1][k] +...+ dp[n-1][k-n+1]
                dp[i][j] = (dp[i][j-1] + dp[i-1][j]) % mod;
                // only n-1 maximum shifts are possible
                if (j >= i) {
                    dp[i][j] = (dp[i][j] - dp[i-1][j-i]) % mod;
                }
                // resolve negative values
                if (dp[i][j] < 0) {
                    dp[i][j] = dp[i][j] + mod;
                }
            }
        }
        return dp[n][k];
    }
}