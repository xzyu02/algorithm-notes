class Solution:
    def rob(self, nums: List[int]) -> int:
        if len(nums) == 1:
            return nums[0]
        dp = nums.copy()
        dp[1] = max(dp[0], dp[1])
        for i in range(2, len(nums)):
            dp[i] = max(dp[i-1], dp[i] + dp[i-2])
        return dp[-1]
    
class Solution:
    def rob(self, nums: List[int]) -> int:
        dp = nums.copy()
        for i in range(2, len(nums)):
            if i == 2:
                dp[i] += dp[i-2]
            else:
                dp[i] += max(dp[i-2], dp[i-3])
        return max(dp)
    
class Solution:
    def rob(self, nums: List[int]) -> int:
        rob1, rob2 = 0, 0
        # [rob1. rob2, 0, 1, ...]
        for n in nums:
            temp = max(rob1 + n, rob2)
            rob1, rob2 = rob2, temp
        return rob2