class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        numsSet = set(nums)
        res = 0
        for i in nums:
            if i not in numsSet:
                continue
            numsSet.remove(i)
            left, right = i-1, i+1
            while left in numsSet:
                numsSet.remove(left)
                left -= 1
            while right in numsSet:
                numsSet.remove(right)
                right += 1
            res = max(res, right - left - 1)
        return res
    
class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        numsSet = set(nums)
        res = 0
        for i in nums:
            # check if i is the start of seq
            if (i-1) not in numsSet:
                l = 0
                while (i+l) in numsSet:
                    numsSet.remove(i+l)
                    l += 1
                res = max(res, l)
        return res