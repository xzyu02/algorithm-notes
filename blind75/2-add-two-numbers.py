# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        dummy = cur = ListNode()
        div, mode = 0, 0

        while l1 or l2:
            val = mode
            if l1:
                val = val + l1.val
                l1 = l1.next
            if l2:
                val = val + l2.val
                l2 = l2.next
            div, mode = val % 10, val // 10
            cur.next = ListNode(div)
            cur = cur.next

        if mode != 0:
            cur.next = ListNode(mode)
            
        return dummy.next