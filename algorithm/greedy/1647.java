// 1647. Minimum Deletions to Make Character Frequencies Unique

class Solution {
    public int minDeletions(String s) {
        char[] freq = new char[26];
        for(int i = 0; i < s.length(); i++)
            freq[s.charAt(i) - 'a']++;
        int ret = 0;
        HashSet<Integer> num = new HashSet<>();
        for(int i = 0; i < freq.length; i++) {
            int cur = freq[i];
            while(num.contains(cur) && cur != 0) {
                cur--;
                ret++;
            }
            num.add(cur);
        }
        return ret;
    }
}