// 538. Convert BST to Greater Tree

class Solution {
    public TreeNode convertBST(TreeNode root) {
        helper(root, 0);
        return root;
    }
    
    private int helper(TreeNode root, int prev) {
        if (root == null) return prev;
        int right = helper(root.right, prev);
        root.val += right;
        int left = helper(root.left, root.val);
        return left;
    }
}