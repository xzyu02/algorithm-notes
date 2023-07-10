# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head:
            return
        dummy = ListNode()
        last = head
        while head != None:
            temp = head
            head = head.next
            temp.next = dummy
            dummy = temp
        last.next = None
        return dummy
    
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, h: Optional[ListNode]) -> Optional[ListNode]:
        dummy = None
        while h:
            temp = h.next
            h.next = dummy
            dummy = h
            h = temp
        return dummy