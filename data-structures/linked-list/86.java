// 86. Partition List

class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode pnt1 = new ListNode(0); // list of smaller values
        ListNode pnt2 = new ListNode(0); // large values
        ListNode headPnt1 = pnt1, headPnt2 = pnt2;
        while(head != null) {
            if (head.val < x) {
                pnt1.next = head;
                pnt1 = pnt1.next;
            } else {
                pnt2.next = head;
                pnt2 = pnt2.next;
            }
            head = head.next;
        }
        pnt1.next = headPnt2.next;
        pnt2.next = null;
        return headPnt1.next;
    }
}