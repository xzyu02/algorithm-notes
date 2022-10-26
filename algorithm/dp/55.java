// 55. Jump Game

class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int end = 0;
        for(int i = 0; i < n && i <= end; i++) {
            end = Math.max(end, i + nums[i]);
        }
        return end >= (n - 1);
    }
}