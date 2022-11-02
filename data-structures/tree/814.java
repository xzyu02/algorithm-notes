// 814. Binary Tree Pruning

class Solution {
    public TreeNode pruneTree(TreeNode root) {
        if (hasOne(root))
            return root;
        return null;
    }
    
    private boolean hasOne(TreeNode root) {
        if (root == null) return false;
        boolean left = hasOne(root.left);
        if (!left) {
            root.left = null;
        }
        boolean right = hasOne(root.right);
        if (!right) {
            root.right = null;
        }
        return root.val == 1 || left || right;
    }
}