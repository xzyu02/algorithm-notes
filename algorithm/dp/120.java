// 120. Triangle

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[] dp = new int[triangle.size()];
        for (int i = 0; i < dp.length; i++) {
            for (int j = i; j >= 0; j--) {
                if (j == 0) {
                    dp[j] = triangle.get(i).get(j) + dp[j];
                } else if (j == i) {
                    dp[j] = triangle.get(i).get(j) + dp[j-1];
                } else {
                    dp[j] = triangle.get(i).get(j) + Math.min(dp[j-1], dp[j]);
                } 
            }
        }
        int min = Integer.MAX_VALUE;
        for (int i : dp) {
            min = Math.min(i, min);
        }
        return min;
    }
}