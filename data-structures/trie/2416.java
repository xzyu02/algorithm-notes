// 2416. Sum of Prefix Scores of Strings

class Solution {
    class Node {
        Node[] a = new Node[26];
        int val = 0;
    }
    
    public int[] sumPrefixScores(String[] words) {
        Node root = new Node();
        for(String wd : words) {
            insert(wd, root);
        }
        int[] res = new int[words.length];
        for(int i = 0; i < res.length; i++) {
            res[i] = getVal(words[i], root);
        }
        return res;
    }
    
    public void insert(String word, Node root) {
        Node cur = root;
        for(int i = 0; i < word.length(); i++) {
            if (cur.a[word.charAt(i) - 'a'] == null) {
                cur.a[word.charAt(i) - 'a'] = new Node();
            }
            cur = cur.a[word.charAt(i) - 'a'];
            cur.val++;
        }
    }
    
    public int getVal(String word, Node root) {
        Node cur = root;
        int res = 0;
        for (int i = 0; i < word.length(); i++) {
            cur = cur.a[word.charAt(i) - 'a'];
            res += cur.val;
        }
        return res;
    }
}
