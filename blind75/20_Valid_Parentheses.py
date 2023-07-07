class Solution:
    def isValid(self, s: str) -> bool:
        dic = {")": "(", "}": "{", "]": "["}
        stack = []
        for c in s:
            if c not in dic:
                stack.append(c)
            else:
                if stack and stack[-1] == dic[c]:
                    stack.pop()
                else:
                    return False
        return not stack