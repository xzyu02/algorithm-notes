// 160. Intersection of Two Linked Lists
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode la = headA, lb = headB;
        while (la != lb) {
            la = (la == null) ? headB : la.next;
            lb = (lb == null) ? headA : lb.next;
        }
        return la;
    }
}