// **583. Delete Operation for Two Strings** 

// Solution 1 for longest common subsequence
class Solution {
    public int minDistance(String word1, String word2) {
        int[][] dp = new int[word1.length()+1][word2.length()+1];
        for (int i = 1; i <= word1.length(); i++) {
            for (int j = 1; j <= word2.length(); j++) {
                if (word1.charAt(i-1) == word2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return word1.length() + word2.length() - 2 * dp[dp.length-1][dp[0].length-1];
    }
}

// Solution 2 for edit distance
class Solution {
    public int minDistance(String word1, String word2) {
        int[][] dp = new int[word1.length()+1][word2.length()+1];
        // initialization
        for (int i = 0; i <= word1.length(); i++) dp[i][0] = i;
        for (int j = 0; j <= word2.length(); j++) dp[0][j] = j;
        // dp
        for (int i = 1; i <= word1.length(); i++) {
            for (int j = 1; j <= word2.length(); j++) {
                if (word1.charAt(i-1) == word2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1]; // no operation needed
                } else {
                    dp[i][j] = Math.min(dp[i-1][j-1] + 2, Math.min(dp[i-1][j] + 1, dp[i][j-1] + 1));
                }
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}