// 345_reverse_vowels
import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public String reverseVowels(String s) {
        HashSet<Character> h = new HashSet<Character>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        int i = 0, j = s.length() - 1;
        char[] c = new char[s.length()];
        while (i <= j) {
            char ci = s.charAt(i);
            char cj = s.charAt(j);
            if (!h.contains(ci)) {
                c[i] = ci;
                i++;
            } else if (!h.contains(cj)) {
                c[j] = cj;
                j--;
            } else {
                c[i] = cj;
                c[j] = ci;
                i++;
                j--;
            }
        }
        return new String(c);
    }
}