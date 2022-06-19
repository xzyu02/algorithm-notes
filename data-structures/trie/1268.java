// 1268. Search Suggestions System

class TrieNode {
    TrieNode[] children = new TrieNode[26];
    List<String> words = new ArrayList<>();
}

class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products);
        TrieNode root = new TrieNode();
        for(String str : products) {
            insert(root, str);
        }
        List<List<String>> results = new ArrayList<>();
        for(int i = 1; i <= searchWord.length(); i++) {
            String prefix = searchWord.substring(0, i);
            results.add(search(root, prefix));
        }
        return results;
    }
    
    public void insert(TrieNode root, String str) {
        TrieNode cur = root;
        for(char c : str.toCharArray()) {
            if(cur.children[c-'a'] == null) {
                cur.children[c-'a'] = new TrieNode();
            }
            cur = cur.children[c-'a'];
            if(cur.words.size() < 3) {
                cur.words.add(str);
            }
        }
    }
    
    public List<String> search(TrieNode root, String str) {
        TrieNode cur = root;
        for(char c : str.toCharArray()) {
            if(cur.children[c-'a'] == null) {
                return new ArrayList<>();
            }
            cur = cur.children[c-'a'];
        }
        return cur.words;
    }
}