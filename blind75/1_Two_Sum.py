class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        prev = {}
        for idx, num in enumerate(nums):
            res = target - num
            if res in prev:
                return [prev[res], idx]
            prev[num] = idx