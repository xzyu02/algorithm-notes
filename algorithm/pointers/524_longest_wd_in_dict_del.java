import java.util.List;

class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
        String longest = "";
        for (String word : dictionary) {
            if (isSub(s, word)) {
                if (word.length() > longest.length()) {
                    longest = word;
                } else if (word.length() == longest.length() && longest.compareTo(word) > 0) {
                    longest = word;
                }
            }  
        }
        return longest;
    }

    public boolean isSub(String s, String target) {
        int i = 0, j = 0;
        while (i < s.length() && j < target.length()) {
            if (s.charAt(i) == target.charAt(j)) {
                j++;
            }
            i++;
        }
        return j == target.length();
    }
}