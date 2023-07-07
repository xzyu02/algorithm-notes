// 45. Jump Game II

class Solution {
    public int jump(int[] nums) {
        int nextPos = 0, maxReach = 0;
        int res = 0;
        for (int i = 0; nextPos < nums.length - 1; i++) {
            maxReach = Math.max(maxReach, i + nums[i]);
            if (i == nextPos) {
                res++;
                nextPos = maxReach;
            }
        }
        return res;
    }
}