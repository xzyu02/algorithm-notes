// 9. Palindrome Number

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String s = Integer.toString(x);
        char[] c = s.toCharArray();
        int i = 0;
        int j = c.length - 1;
        while (i <= j) {
            if (c[i++] != c[j--]) {
                return false;
            }
        }
        return true;
    }
}