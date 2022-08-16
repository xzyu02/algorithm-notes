// 916. Word Subsets
import java.util.*;

class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int[] count = new int[26];
        for(String wd : words2) {
            int[] temp = cnt(wd);
            for(int i = 0; i < count.length; i++) {
                // we record the maximum occurence of letters in each word
                // e.g. B = [abb, bcc], then we have cnt = {a:1, b:2 ,c:2}
                // "abbcc" is the case that two substrings are using same letter 'b'
                count[i] = Math.max(count[i], temp[i]);
            }
        }
        List<String> result = new ArrayList<>();
        for(String wd : words1) {
            int[] temp = cnt(wd);
            boolean flag = true;
            for(int i = 0; i < count.length; i++) {
                if (temp[i] < count[i]) {
                    flag = false;
                    break;
                }
            }
            if (flag) result.add(wd);
        }
        return result;
    }
    
    private int[] cnt(String word) {
        int[] num = new int[26];
        for(char c : word.toCharArray()) num[c-'a']++;
        return num;
    }
}