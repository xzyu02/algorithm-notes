class Solution {
    public String reverseWords(String s) {
        char[] c = s.toCharArray();
        int i = 0, j = 0;
        while (i < c.length) {
            if (c[i++] == ' ') {
                reverse(c, j, i - 2);
                j = i;
            } else if (i == c.length - 1) {
                reverse(c, j, i);
            }
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