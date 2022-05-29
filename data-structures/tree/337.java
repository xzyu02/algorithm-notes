// 337. House Robber III

class Solution {
    public int rob(TreeNode root) {
        int[] r = helper(root);
        return Math.max(r[0], r[1]);
    }
    
    private int[] helper(TreeNode root) {
        int[] res = new int[2]; // [value that skip root, value of root and grandchildren]
        if (root == null) return res;
        int[] left = helper(root.left);
        int[] right = helper(root.right);
        // skips root, find max value between children and grandchildren
        res[0] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        // keeps root, add up grandchildren
        res[1] = root.val + left[0] + right[0];
        return res;
    }
}