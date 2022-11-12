// 2461. Maximum Sum of Distinct Subarrays With Length K

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int[] pos = new int[100001];
        Arrays.fill(pos, -1);
        long sum = 0, max = 0;
        int nonRep = 0;
        for(int i = 0, j = 0; j < nums.length; j++) {
            int prev = nums[i], cur = nums[j];
            if (j - i >= k) {
                sum -= prev;
                i++;
                pos[prev] = -1;
            }
            // update position
            if (pos[cur] != -1) {
                while (i <= pos[cur]) {
                    sum -= nums[i];
                    i++;
                }
            }
            pos[cur] = j;
            sum += cur;
            if (j - i + 1 >= k) {
                max = Math.max(sum, max);
            }
        }
        return max;
    }
}