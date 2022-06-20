// 820. Short Encoding of Words

class Solution {
    public int minimumLengthEncoding(String[] words) {
        HashSet<String> set = new HashSet<>(Arrays.asList(words));
        for(String w : words) {
            for(int i = 1; i < w.length(); i++) {
                set.remove(w.substring(i)); // remove suffix
            }
        }
        int ret = 0;
        for(String w : set) {
            ret += w.length() + 1;
        }
        return ret;
    }
}