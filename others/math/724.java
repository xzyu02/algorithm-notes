// 724. Find Pivot Index

class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i != 0) left += nums[i-1];
            if (sum - left - nums[i] == left) return i;
        }
        return -1;
    }
}