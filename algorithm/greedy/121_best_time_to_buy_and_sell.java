package greedy;

class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int start = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < start) {
                start = prices[i];
            }
            profit = Math.max(profit, prices[i] - start);
        }
        return profit;
    }
}
