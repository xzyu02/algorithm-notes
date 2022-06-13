// 208. Implement Trie (Prefix Tree)

class TrieNode {
    public TrieNode[] children = new TrieNode[26];
    public boolean isLeaf;
}

class Trie {

    private TrieNode root;
    
    public Trie() {
        root = new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode cur = root;
        for (int i = 0; i < word.length(); i++) {
            if (cur.children[word.charAt(i) - 'a'] == null) {
                cur.children[word.charAt(i) - 'a'] = new TrieNode();
            }
            cur = cur.children[word.charAt(i) - 'a'];
        }
        cur.isLeaf = true;
    }
    
    public boolean search(String word) {
        TrieNode cur = root;
        for (int i = 0; i < word.length(); i++) {
            if (cur.children[word.charAt(i) - 'a'] == null) {
                return false;
            }
            cur = cur.children[word.charAt(i) - 'a'];
        }
        return cur.isLeaf;
    }
    
    public boolean startsWith(String prefix) {
        TrieNode cur = root;
        for (int i = 0; i < prefix.length(); i++) {
            if (cur.children[prefix.charAt(i) - 'a'] == null) {
                return false;
            }
            cur = cur.children[prefix.charAt(i) - 'a'];
        }
        return true;
    }
}