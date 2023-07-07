class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        res = [1] * len(nums)
        prefix, postfix = 1, 1
        # go forward
        for i in range(len(nums)):
            res[i] *= prefix
            prefix *= nums[i]
        # go backward
        for i in range(len(nums)-1, -1, -1):
            res[i] *= postfix
            postfix *= nums[i]
        return res