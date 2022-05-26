// 725. Split Linked List in Parts

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] parts = new ListNode[k];
        if (head == null) return parts;
        int len = length(head);
        int i = 0, base = len / k, rem = len % k;
        while(head != null) {
            int curLen = base + (rem-- > 0 ? 1 : 0);
            parts[i++] = head;
            // move head to the end of current part
            for (int j = 0; j < curLen - 1; j++) {
                head = head.next;
            }
            // split
            ListNode next = head.next;
            head.next = null;
            head = next;
        }
        return parts;
    }
    
    private int length(ListNode head) {
        int n = 0;
        while(head != null) {
            head = head.next;
            n++;
        }
        return n;
    }
}