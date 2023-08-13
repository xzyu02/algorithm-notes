# O(n) memory
class Solution:
    def trap(self, height: List[int]) -> int:
        maxl, maxr = [0] * len(height), [0] * len(height)

        maxlval = 0
        for i in range(len(height)):
            maxl[i] = maxlval
            maxlval = max(maxlval, height[i])

        maxrval = 0
        for i in range(len(height)-1, -1, -1):
            maxr[i] = maxrval
            maxrval = max(maxrval, height[i])

        trapped = 0
        for i in range(len(height)):
            minval = min(maxl[i], maxr[i])
            v = minval - height[i]
            if v > 0:
                trapped = trapped + v
        return trapped
    
# O(1) memory

class Solution:
    def trap(self, height: List[int]) -> int:
        l, r = 0, len(height)-1
        lval, rval = height[l], height[r]
        trapped = 0

        while l < r:
            if lval <= rval:
                l = l + 1
                v = lval - height[l]
                lval = max(lval, height[l])
            else:
                r = r - 1
                v = rval - height[r]
                rval = max(rval, height[r])
            if v > 0:
                trapped = trapped + v
        
        return trapped
