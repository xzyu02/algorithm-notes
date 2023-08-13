class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
        # Floyd's Algot

        slow, fast = 0, 0
        while True:
            slow = nums[slow]
            fast = nums[nums[fast]] # move two step
            if slow == fast:
                # first intersection
                break
        
        slow2 = 0
        while True:
            slow, slow2 = nums[slow], nums[slow2]
            if slow == slow2:
                return slow