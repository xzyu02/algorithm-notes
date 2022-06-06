// 108. Convert Sorted Array to Binary Search Tree

class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }
    
    private TreeNode helper(int[] nums, int low, int high) {
        if (low > high)
            return null;
        int mid = (low + high) / 2;
        TreeNode left = helper(nums, low, mid-1);
        TreeNode right = helper(nums, mid+1, high);
        TreeNode root = new TreeNode(nums[mid], left, right);
        return root;
    }
}