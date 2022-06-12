// 1695. Maximum Erasure Value

class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int max = 0, curSum = 0;
        for (int left = 0, right = 0; right < nums.length;) {
            if (!set.contains(nums[right])) {
                curSum += nums[right];
                set.add(nums[right++]);
                max = Math.max(max, curSum);
            } else {
                curSum -= nums[left];
                set.remove(nums[left++]);
            }
        }
        return max;
    }
}