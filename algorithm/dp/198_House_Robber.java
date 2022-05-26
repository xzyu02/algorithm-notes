class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        int[] opt = new int[nums.length];
        opt[0] = nums[0];
        opt[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++)
            opt[i] = Math.max(opt[i-1], opt[i-2]+nums[i]);
        return opt[opt.length-1];
    }
}