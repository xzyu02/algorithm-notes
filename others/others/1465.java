// 1465. Maximum Area of a Piece of Cake After Horizontal and Vertical Cuts

class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        long maxh = getMaxArea(h, horizontalCuts);
        long maxw = getMaxArea(w, verticalCuts);                                                 
        return (int)(maxh * maxw % (long)(1e9+7));
    }
    
    private long getMaxArea(int end, int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int max = nums[0];
        for (int i = 1; i < n; i++) {
            max = Math.max(max, nums[i] - nums[i-1]);
        }
        max = Math.max(max, end - nums[n - 1]);
        return max;
    }
}