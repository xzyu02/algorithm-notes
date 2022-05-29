// 687. Longest Univalue Path

class Solution {
    private int num = 0;
        
    public int longestUnivaluePath(TreeNode root) {
        if (root == null) return 0;
        univPathLen(root, -1);
        return num;
    }
    
    private int univPathLen(TreeNode root, int prev) {
        if (root == null) return 0;
        int left = univPathLen(root.left, root.val);
        int right = univPathLen(root.right, root.val);
        num = Math.max(left + right, num);
        if (prev == root.val) return Math.max(left, right) + 1;
        return 0;
    }
}