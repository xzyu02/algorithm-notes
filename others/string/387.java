// 387. First Unique Character in a String

class Solution {
    public int firstUniqChar(String s) {
        char[] chars = new char[26];
        for(char c : s.toCharArray()) {
            chars[c - 'a']++;
        }
        for(int i = 0; i < s.length(); i++) {
            if (chars[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}