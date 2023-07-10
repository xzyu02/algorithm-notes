class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        res = []
        nums.sort()
        for idx, val in enumerate(nums):
            # skip checked num already
            if idx > 0 and nums[idx] == nums[idx-1]:
                continue

            i, j = idx+1, len(nums)-1
            while i < j:
                sum3 = val + nums[i] + nums[j]
                if sum3 < 0:
                    i += 1
                elif sum3 > 0:
                    j -= 1
                else:
                    res.append([val, nums[i], nums[j]])
                    # step right to skip duplicated i
                    i += 1
                    while i < j and nums[i] == nums[i-1]:
                        i += 1
        
        return res