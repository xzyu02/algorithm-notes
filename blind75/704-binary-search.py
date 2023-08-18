class Solution:
    def search(self, nums: List[int], target: int) -> int:
        i, j = 0, len(nums)-1,
        while i <= j:
            mid = i + ((j - i) // 2)  # (l + r) // 2 can lead to overflow
            if nums[mid] == target:
                return mid
            if nums[mid] < target:
                i = mid + 1
            else:
                j = mid - 1
        return -1   