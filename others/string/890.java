// 890. Find and Replace Pattern

class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> res = new ArrayList<>();
        for(String wd : words) {
            if (match(wd, pattern)) res.add(wd);
        }
        return res;
    }
    
    private boolean match(String wd, String pattern) {
        int[] p = new int[26];
        int[] w = new int[26];
        for(int i = 0; i < wd.length(); i++) {
            int ploc = pattern.charAt(i) - 'a';
            int wloc = wd.charAt(i) - 'a';
            if (w[wloc] != p[ploc]) {
                return false;
            } else {
                // use index + 1 to record distinct place for this character
                p[ploc] = w[wloc] = i+1; 
            }
        }
        return true;
    }
}