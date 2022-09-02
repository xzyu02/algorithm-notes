// 1448. Count Good Nodes in Binary Tree

class Solution {
    public int goodNodes(TreeNode root) {
        return helper(root, Integer.MIN_VALUE);
    }
    
    private int helper(TreeNode root, int max) {
        if (root == null) return 0;
        if (root.val >= max) {
            return helper(root.left, root.val) + helper(root.right, root.val) + 1;
        } else {
            return helper(root.left, max) + helper(root.right, max);
        }
    }
}