class Solution:
    def longestPalindrome(self, s: str) -> str:
        res = ""
        maxlen = 0
        for idx in range(len(s)):
            # odd condition
            i, j = idx, idx
            while i >= 0 and j < len(s) and s[i] == s[j]:
                i -= 1
                j += 1
            
            curlen = j-i-1
            if curlen >= maxlen:
                maxlen = curlen
                res = s[i+1:j]
            
            # even condition
            i, j = idx-1, idx
            while i >= 0 and j < len(s) and s[i] == s[j]:
                i -= 1
                j += 1

            curlen = j-i-1
            if curlen >= maxlen:
                maxlen = curlen
                res = s[i+1:j]
        return res