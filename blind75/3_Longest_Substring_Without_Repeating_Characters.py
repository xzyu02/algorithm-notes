class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        i = 0
        res = 0
        while i < len(s):
            j = i
            substr = {}
            while j < len(s) and s[j] not in substr:
                substr[s[j]] = j # last appear idx
                j += 1
            res = max(res, j - i)
            if j >= len(s):
                break
            i = substr[s[j]] + 1
        return res 
    
class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        l = 0
        res = 0
        strset = set()
        for r in range(len(s)):
            while s[r] in strset:
                strset.remove(s[l])
                l += 1
            strset.add(s[r])
            res = max(res, r - l + 1)
        return res 