// 543. Diameter of Binary Tree

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
    public int diameterOfBinaryTree(TreeNode root) {
        return (root == null) ? 0 : maxDepth(root)[0];
    }
    
    // memorization: [max distance, height]
    private int[] maxDepth(TreeNode root) {
        int[] cur = new int[2];
        if (root == null) return cur;
        int[] left = maxDepth(root.left);
        int[] right = maxDepth(root.right);
        cur[0] = Math.max(Math.max(left[0], right[0]), left[1] + right[1]);
        cur[1] = Math.max(left[1], right[1]) + 1;
        return cur;
    }
}