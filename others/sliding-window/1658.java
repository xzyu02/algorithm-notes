// 1658. Minimum Operations to Reduce X to Zero

class Solution {
    public int minOperations(int[] nums, int x) {
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        int target = sum - x, curSum = 0, maxLen = -1;
        for (int left = 0, right = 0; right < nums.length; right++) {
            curSum += nums[right];
            while (left <= right && curSum > target) {
                curSum -= nums[left++];
            }
            if (curSum == target) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }
        return (maxLen == -1) ? -1 : nums.length - maxLen;
    }
} 