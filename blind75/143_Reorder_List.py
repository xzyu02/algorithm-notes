class Solution:
    def reorderList(self, head: Optional[ListNode]) -> None:
        """
        Do not return anything, modify head in-place instead.
        """
        # find mid point
        slow, fast = head, head.next
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next

        # reverse second half
        prev, cur = None, slow.next
        slow.next = None
        while cur != None:
            temp = cur.next
            cur.next = prev
            prev = cur 
            cur = temp

        # merge
        h1, h2 = head, prev 
        while h2:
            tmp1, tmp2 = h1.next, h2.next
            h1.next = h2
            h2.next = tmp1
            h1, h2 = tmp1, tmp2