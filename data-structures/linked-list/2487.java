// 2487. Remove Nodes From Linked List

class Solution {
    public ListNode removeNodes(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode node = head;
        while (node != null) {
            stack.push(node);
            node = node.next;
        }
        ListNode start = new ListNode(-1);
        start.next = stack.pop();
        while(!stack.isEmpty()) {
            ListNode cur = stack.pop();
            if (cur.val >= start.next.val) {
                cur.next = start.next;
                start.next = cur;
            }
        }
        return start.next;
    }
}