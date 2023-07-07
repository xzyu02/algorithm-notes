class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        res = 0
        a = prices[0]
        for p in prices:
            if p <= a:
                a = p
            else:
                res = max(res, p-a)
        return res