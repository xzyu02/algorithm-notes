// 409. Longest Palindrome

class Solution {
    public int longestPalindrome(String s) {
        int[] chars = new int[256];
        for(int i = 0; i < s.length(); i++) chars[s.charAt(i)]++;
        int cnt = 0;
        for(int i : chars) {
            if(i == 0) continue;
            cnt += (i / 2) * 2;
        }
        if(cnt < s.length()) cnt++;
        return cnt;  
    }
}