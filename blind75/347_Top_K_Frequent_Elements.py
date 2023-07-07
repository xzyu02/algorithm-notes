class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        counts = Counter(nums)
        freqs = [[] for i in range(len(nums) + 1)]
        for num, freq in counts.items():
            freqs[freq].append(num)
        res = []
        for i in range(len(freqs) - 1, 0, -1):
            for i in freqs[i]:
                res.append(i)
                if len(res) == k:
                    return res
        return 