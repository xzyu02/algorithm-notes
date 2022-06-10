// 3. Longest Substring Without Repeating Characters

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] cache = new int[256];
        int ans = 0;
        for(int left = 0, right = 0; right < s.length(); right++) {
            cache[s.charAt(right)] += 1;
            while(cache[s.charAt(right)] > 1) {
                cache[s.charAt(left)] -= 1;
                left++;
            }
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}