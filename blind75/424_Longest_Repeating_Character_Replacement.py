class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        chars = defaultdict(int)
        max_chars, res = 0, 0
        l = 0
        for r in range(len(s)):
            chars[s[r]] += 1
            max_chars = max(max_chars, chars[s[r]])
            if r - l + 1 - max_chars > k:
                chars[s[l]] -= 1
                l += 1
            res = max(res, r - l + 1)
        return res