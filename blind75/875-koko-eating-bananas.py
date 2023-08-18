class Solution:
    def minEatingSpeed(self, piles: List[int], h: int) -> int:
        l, r = 1, max(piles)
        res = max(piles)
        while l <= r:
            k = l + (r - l) // 2
            h_res = sum([math.ceil(i / k) for i in piles])
            if h_res <= h:
                res = min(res, k)
                r = k - 1
            elif h_res > h:
                l = k + 1
        return res