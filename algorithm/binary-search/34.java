// 34. Find First and Last Position of Element in Sorted Array

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ret = new int[2];
        ret[0] = find(nums, target, 0);
        ret[1] = find(nums, target, 1);
        return ret;
    }
    
    private int find(int[] nums, int target, int type) {
        int idx = -1;
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            // type 0 is find start, 1 is find end
            if (type == 0) {
                if (nums[mid] >= target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (nums[mid] <= target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                } 
            }
            if (nums[mid] == target) idx = mid;
        }
        return idx;
    }
}