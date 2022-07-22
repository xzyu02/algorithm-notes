// 792. Number of Matching Subsequences

class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        HashMap<Character, Queue<String>> map = new HashMap<>();
        // initialize map
        for (char i = 'a'; i <= 'z'; i++) map.put(i, new LinkedList<>());
        // add word into each queue
        for (String word : words) map.get(word.charAt(0)).add(word);
        // go through s and find matching subsequences
        int cnt = 0;
        for (char c : s.toCharArray()) {
            Queue<String> queue = map.get(c);
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                String cur = queue.poll();
                if (cur.length() == 1) {
                    cnt++;
                } else {
                    map.get(cur.charAt(1)).add(cur.substring(1));
                }
            }
        }
        return cnt;
    }
}