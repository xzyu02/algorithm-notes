// 92. Reverse Linked List II

class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int i = 0;
        ListNode cur = dummy.next, prev = dummy;
        while (i++ < left - 1) {
            prev = prev.next; // prev node
            cur = cur.next; // left pos node
        }
        // reverse
        ListNode then = cur.next;
        while (i++ < right) {
            cur.next = then.next;
            then.next = prev.next;
            prev.next = then;
            then = cur.next;
        }
        return dummy.next;
    }
}