// 404. Sum of Left Leaves

class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) 
            return 0;
        return helper(root, false);
    }
    
    private int helper(TreeNode root, boolean isLeft) {
        if (isLeft && root.left == null && root.right == null) return root.val;
        int left = (root.left == null) ? 0 : helper(root.left, true);
        int right = (root.right == null) ? 0 : helper(root.right, false);
        return left + right;
    }
}