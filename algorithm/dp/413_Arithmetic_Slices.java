class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int[] opt = new int[nums.length];
        for (int i = 2; i < opt.length; i++) {
            if (nums[i] - nums[i-1] == nums[i-1] - nums[i-2]) {
                opt[i] = opt[i-1] + 1;
            }
        }
        int total = 0;
        for (int i : opt) {
            total += i;
        }
        return total;
    }
}