// 144. Binary Tree Preorder Traversal

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> pre = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()) {
            TreeNode cur = stack.pop();
            if (cur == null) {
                continue;
            }
            pre.add(cur.val);
            stack.push(cur.right);
            stack.push(cur.left);
        }
        return pre;
    }
}