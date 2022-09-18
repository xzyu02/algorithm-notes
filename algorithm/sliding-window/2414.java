// 2414. Length of the Longest Alphabetical Continuous Substring

class Solution {
    public int longestContinuousSubstring(String s) {
        int ans = 1, res = 1;
        for (int i = 1; i < s.length(); ++i) {
            if (s.charAt(i) - 1 == s.charAt(i-1)) {
                ans++;
            } else {
                ans = 1;
            }
            res = Math.max(res, ans);
        }
        return res;
    }
}