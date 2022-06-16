// 5. Longest Palindromic Substring

class Solution {
    public String longestPalindrome(String s) {
        int n = s.length(), start = 1, end = 0;
        String res = "";
        boolean[][] dp = new boolean[n][n];
        for(int i = n - 1; i >= 0; i--) {
            for(int j = i; j < n; j++) {
                dp[i][j] = s.charAt(i) == s.charAt(j) && (j - i < 3 || dp[i+1][j-1]);
                // for string from i to j:
                // i == j, chars are the same
                // i + 1 == j, only compare two chars
                // i + 2 == j, same as i + 1 == j since the middle one doesn't matter.
                // Only when i + 3 == j, we need to both compare two chars and middle part
                if (dp[i][j] && j - i + 1 > end - start + 1) {
                    start = i;
                    end = j;
                }
            }
        }
        return s.substring(start, end+1);
    }
}