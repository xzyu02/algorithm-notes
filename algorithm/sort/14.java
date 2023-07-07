// 14. Longest Common Prefix

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        Arrays.sort(strs);
        String first = strs[0], last = strs[strs.length-1];
        int i = 0;
        while(i < first.length()) {
            if (first.charAt(i) != last.charAt(i)) {
                break;
            }
            i++;
        }
        return i == 0 ? "" : first.substring(0, i);
    }
}