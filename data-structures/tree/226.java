// 226. Invert Binary Tree

class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return root;
        TreeNode right = invertTree(root.left);
        TreeNode left = invertTree(root.right);
        root.left = left;
        root.right = right;
        return root;
    }
}