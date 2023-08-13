"""
# Definition for a Node.
class Node:
    def __init__(self, x: int, next: 'Node' = None, random: 'Node' = None):
        self.val = int(x)
        self.next = next
        self.random = random
"""

class Solution:
    def copyRandomList(self, head: 'Optional[Node]') -> 'Optional[Node]':
        if not head:
            return None
            
        cur = head
        nodemap = {}
        while cur:
            curcpy = Node(cur.val)
            nodemap[cur] = curcpy
            cur = cur.next
        
        for node, nodecpy in nodemap.items():
            if node.next:
                nodecpy.next = nodemap[node.next]
            if node.random:
                nodecpy.random = nodemap[node.random]
        
        return nodemap[head]