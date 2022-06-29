// 242. Valid Anagram

class Solution {
    public boolean isAnagram(String s, String t) {
        int[] cnt = new int[26];
        for (int i = 0; i < s.length(); i++) cnt[s.charAt(i) - 'a']++;
        for (int i = 0; i < t.length(); i++) cnt[t.charAt(i) - 'a']--;
        for (int i : cnt) {
            if (i != 0) return false;
        }
        return true;
    }
}