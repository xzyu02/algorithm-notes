// 1048. Longest String Chain

class Solution {
    HashSet<String> wordSet = new HashSet<>();
    HashMap<String, Integer> mem = new HashMap<>();
    
    public int longestStrChain(String[] words) {
        int max = 0;
        for (String w : words) wordSet.add(w);
        for (String w : words) max = Math.max(max, dfs(w));
        return max;
    }
    
    private int dfs(String word) {
        if (mem.containsKey(word)) return mem.get(word);
        int cnt = 0;
        for(int i = 0; i < word.length(); i++) {
            String prev = word.substring(0, i) + word.substring(i+1); // deduct one char
            if (wordSet.contains(prev)) {
                cnt = Math.max(cnt, dfs(prev)); // dfs search word
            }
        }
        mem.put(word, cnt+1);
        return cnt+1;
    }
}