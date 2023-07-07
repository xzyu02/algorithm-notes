class Solution:
    def isPalindrome(self, s: str) -> bool:
        a = [c.lower() for c in s if c.isalnum()]
        return a == a[::-1]