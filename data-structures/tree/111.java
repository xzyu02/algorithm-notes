// 111. Minimum Depth of Binary Tree

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
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int depth = 0;
        while(!queue.isEmpty()) {
            depth++;
            int level = queue.size();
            for (int i = 0; i < level; i++) {
                TreeNode cur = queue.poll();
                if (cur.left == null && cur.right == null) 
                    return depth;
                if (cur.left != null) 
                    queue.add(cur.left);
                if (cur.right != null) 
                    queue.add(cur.right);
            }
        }
        return depth;
    }
}