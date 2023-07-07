class Solution:
    def rob(self, nums: List[int]) -> int:
        if len(nums) == 1:
            return nums[0]
        return max(self.rob_help(nums[:-1]), self.rob_help(nums[1:]))

    def rob_help(self, nums):
        rob1, rob2 = 0, 0
        # [rob1. rob2, 0, 1, ...]
        for n in nums:
            temp = max(rob1 + n, rob2)
            rob1, rob2 = rob2, temp
        return rob2
    
