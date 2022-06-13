// 677. Map Sum Pairs

class MapSum {
    
    private TrieNode root;
    
    class TrieNode {
        TrieNode[] children = new TrieNode[26];
        int val = 0;
    }

    public MapSum() {
        root = new TrieNode();
    }
    
    public void insert(String key, int val) {
        TrieNode cur = root;
        for (int i = 0; i < key.length(); i++) {
            if (cur.children[key.charAt(i) - 'a'] == null) {
                cur.children[key.charAt(i) - 'a'] = new TrieNode();
            }
            cur = cur.children[key.charAt(i) - 'a'];
        }
        cur.val = val;
    }
    
    public int sum(String prefix) {
        int sum = 0;
        TrieNode cur = root;
        for (int i = 0; i < prefix.length(); i++) {
            if (cur.children[prefix.charAt(i) - 'a'] == null) {
                return sum;
            }
            cur = cur.children[prefix.charAt(i) - 'a'];
        }
        // bfs add all values
        Queue<TrieNode> nums = new LinkedList<>();
        nums.add(cur);
        while (!nums.isEmpty()) {
            cur = nums.poll();
            sum += cur.val;
            for (TrieNode child : cur.children) {
                if (child != null) {
                    nums.add(child);
                }
            }
        }
        return sum;
    }
}