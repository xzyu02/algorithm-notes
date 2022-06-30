// 462. Minimum Moves to Equal Array Elements II

class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int res = 0, med = nums[nums.length/2];
        for(int i : nums)
            res += Math.abs(i - med);
        return res;
    }
}