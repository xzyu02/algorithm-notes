// 110. Balanced Binary Tree

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        return balancedHeight(root) != -1;
    }
    
    // bottom to up approach
    private int balancedHeight(TreeNode root) {
        // Base case
        if (root == null) {
            return 0;
        }
        // Left cases
        int left = balancedHeight(root.left);
        if (left == -1) {
            return -1;
        }
        // right cases
        int right = balancedHeight(root.right);
        if (right == -1) {
            return -1;
        }
        // 
        if (Math.abs(left - right) > 1) {
            return -1;
        } 
        // return max height + current 1
        return Math.max(left, right) + 1;
    }
}