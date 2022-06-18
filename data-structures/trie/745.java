// 745. Prefix and Suffix Search

class TrieNode {
    TrieNode[] children;
    int weight;
    
    public TrieNode() {
        children = new TrieNode[27];
        weight = 0;
    }
    
}

class WordFilter {
    TrieNode root = new TrieNode();
    
    public WordFilter(String[] words) {
        for(int w = 0; w < words.length; w++) {
            String ist = words[w] + '{' + words[w];
            for(int i = 0; i <= words[w].length(); i++) {
                insert(root, ist.substring(i), w);
            }
        }
    }
    
    public int f(String prefix, String suffix) {
        String target = suffix + '{' + prefix;
        TrieNode cur = root;
        for(char c : target.toCharArray()) {
            if (cur.children[c-'a'] == null) return -1;
            cur = cur.children[c-'a'];
        }
        return cur.weight;
    }
    
    private void insert(TrieNode node, String word, int weight) {
        TrieNode cur = node;
        for(char c : word.toCharArray()) {
            int pos = c - 'a';
            if (cur.children[pos] == null) {
                cur.children[pos] = new TrieNode();
            }
            cur = cur.children[pos];
            cur.weight = weight;
        }
    }
}