class Solution {
    public String reverseStr(String s, int k) {
        if (k >= s.length()) {
            return reverseString(s.toCharArray());
        }
        String start = reverseString(s.substring(0, k).toCharArray());
        if (2*k > s.length()) {
            return start + s.substring(k);
        } else {
            return start + s.substring(k, 2*k) + reverseStr(s.substring(2*k),k);
        }
    }

    public String reverseString(char[] s) {
        int i = 0, j = s.length - 1;
        while (i < j) {
            char temp = s[i];
            s[i++] = s[j];
            s[j--] = temp;
        }
        return new String(s);
    }
}

class SolutionBetter {
    public String reverseStr(String s, int k) {
        char[] c = s.toCharArray();
        int i = 0;
        while (i < c.length) {
            int end = i + k;
            if (end > c.length) end = c.length;
            reverse(c, i, end - 1);
            i += 2*k;
        }
        return new String(c);
    }

    private void reverse(char[] s, int i, int j) {
        while (i < j) {
            char temp = s[i];
            s[i++] = s[j];
            s[j--] = temp;
        }
    }
}