// 322. Coin Change

class Solution {
    public int coinChange(int[] coins, int amount) {
        if (amount <= 0) {
            return 0;
        }
        int[] dp = new int[amount + 1];
        for (int i = 1; i <= amount; i++) {
            dp[i] = amount + 1;
            for (int c : coins) {
                int prev = i - c;
                if (prev >= 0) {
                    dp[i] = Math.min(dp[i], dp[prev] + 1);
                }
            }
        }
        return dp[amount] == amount + 1 ? -1 : dp[amount];
    }
}