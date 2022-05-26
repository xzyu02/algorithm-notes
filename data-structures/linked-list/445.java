// 445. Add Two Numbers II

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> l1s = newStack(l1);
        Stack<Integer> l2s = newStack(l2);
        int carry = 0, num1 = 0, num2 = 0;
        ListNode ret = new ListNode(-1);
        while(!l1s.isEmpty() || !l2s.isEmpty() || carry != 0) {
            num1 = l1s.isEmpty() ? 0 : l1s.pop();
            num2 = l2s.isEmpty() ? 0 : l2s.pop();
            // add current digit and carry from last digit
            int num = num1 + num2 + carry; 
            ListNode cur = new ListNode(num % 10);
            // insert between ret and ret.next
            cur.next = ret.next;
            ret.next = cur;
            carry = num / 10;
        }
        return ret.next;
    }
    
    private Stack<Integer> newStack(ListNode node) {
        Stack<Integer> stack = new Stack<>();
        while(node != null) {
            stack.push(node.val);
            node = node.next;
        }
        return stack;
    }
}