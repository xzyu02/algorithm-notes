class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) 
            return true;
        s = s.toLowerCase();
        char[] c = s.toCharArray();
        int i = 0, j = c.length - 1;
        while (i <= j) {
            char ci = c[i], cj = c[j];
            if (!Character.isLetterOrDigit(ci)) {
                i++;
            } else if (!Character.isLetterOrDigit(cj)) {
                j--;
            } else {
                if (ci != cj) {
                    return false;
                }
                i++;
                j--;
            }
        }
        return true;
    }
}