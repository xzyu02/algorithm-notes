// 112. Path Sum

class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false; // base case
        if (targetSum == root.val && root.left == null && root.right == null)
            return true; // target value matches the root, and root is a leaf
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }
}