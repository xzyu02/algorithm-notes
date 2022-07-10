// 1473. Paint House III

class Solution {
    private Integer[][][] memo = new Integer[101][21][101]; // [house][color][target]
    private int MAX = (int)1e8;
    private int m, n;
    
    public int minCost(int[] houses, int[][] cost, int m, int n, int target) {
        this.m = m;
        this.n = n;
        int res = dfs(houses, cost, 0, 0, target);
        return res >= MAX ? -1 : res;
    }
    
    private int dfs(int[] houses, int[][] cost, int houseIdx, int prevColor, int target) {
        if (houseIdx == m || target < 0) {
            return target == 0 ? 0 : MAX; // base cases
        }
        if (memo[houseIdx][prevColor][target] != null) 
            return memo[houseIdx][prevColor][target];
        
        if (houses[houseIdx] != 0) { // already painted
            int curColor = houses[houseIdx];
            int newTarget = target - (curColor != prevColor ? 1 : 0);
            int val = dfs(houses, cost, houseIdx + 1, curColor, newTarget);
            return memo[houseIdx][prevColor][target] = val;
        }
        // find best color
        int res = MAX;
        for(int curColor = 1; curColor <= n; curColor++) {
            int newTarget = target - (curColor != prevColor ? 1 : 0);
            int val = dfs(houses, cost, houseIdx + 1, curColor, newTarget);
            res = Math.min(res, val + cost[houseIdx][curColor - 1]); 
        }
        return memo[houseIdx][prevColor][target] = res;
    }
}