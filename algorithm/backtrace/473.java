// 473. Matchsticks to Square

class Solution {
    public boolean makesquare(int[] matchsticks) {
        // edge cases match
        if (matchsticks == null || matchsticks.length < 4)
            return false;
        int sum = 0;
        for(int i : matchsticks) sum += i;
        if (sum % 4 != 0) return false;
        // sort, then we will backtrace from longest stick
        Arrays.sort(matchsticks);
        // backtrace
        return dfs(matchsticks, new int[4], matchsticks.length - 1, sum / 4);
    }
    
    private boolean dfs(int[] nums, int[] sums, int idx, int target) {
        if (idx == -1) {
            return sums[0] == target && sums[1] == target && sums[2] == target;
        }
        for(int i = 0; i < 4; i++) {
            if (sums[i] + nums[idx] > target)
                continue;
            sums[i] += nums[idx];
            if (dfs(nums, sums, idx - 1, target))
                return true;
            sums[i] -= nums[idx];
        }
        return false;
    }
}