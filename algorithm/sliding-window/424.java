// 424. Longest Repeating Character Replacement

class Solution {
    public int characterReplacement(String s, int k) {
        int[] arr = new int[26];
        int start = 0;
        int maxCnt = 0, maxLen = 0;
        for(int end = 0; end < s.length(); end++) {
            arr[s.charAt(end) - 'A']++;
            maxCnt = Math.max(arr[s.charAt(end) - 'A'], maxCnt);
            while((end - start + 1) - maxCnt > k) {
                arr[s.charAt(start) - 'A']--;
                start++;
            }
            maxLen = Math.max(maxLen, end - start + 1);
        }
        return maxLen;
    }
}