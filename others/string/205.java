// 205. Isomorphic Strings

class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] idxs = new int[256];
        int[] idxt = new int[256];
        for(int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            if(idxs[sc] != idxt[tc]) return false;
            idxs[sc] = i + 1;
            idxt[tc] = i + 1;
        }
        return true;
    }
}