class Solution:
    def climbStairs(self, n: int) -> int:
        if n <= 3:
            return n
        one, two = 2, 3
        for i in range(4, n+1):
            three = one + two
            one = two
            two = three
        return two