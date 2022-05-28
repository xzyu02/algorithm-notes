// 437. Path Sum III

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
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) return 0;
        return findPath(root, targetSum) + pathSum(root.left, targetSum) + pathSum(root.right, targetSum);  
    }
    
    private int findPath(TreeNode r, int a) {
        if (r == null) return 0;
        return ((a == r.val) ? 1 : 0) + findPath(r.left, a - r.val) + findPath(r.right, a - r.val);
    }
}