// 236. Lowest Common Ancestor of a Binary Tree

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // if both p and q exist in Tree rooted at root, then return their LCA
        // if neither p and q exist in Tree rooted at root, then return null
        // if only one of p or q (NOT both of them), exists in Tree rooted at root, return it
        if (root == p || root == q || root == null)
            return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left == null) return right;
        if (right == null) return left;
        return root;
    }
}