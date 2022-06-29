// 9. Palindrome Number

// two pointer
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

// no extra space
class Solution {
    public boolean isPalindrome(int x) {
        if (x == 0) {
            return true;
        }
        if (x < 0 || x % 10 == 0) {
            return false;
        }
        int r = 0;
        while (x > r) {
            r = r * 10 + x % 10;
            x = x / 10;
        }
        return x == r || x == r/10 ;
    }
}