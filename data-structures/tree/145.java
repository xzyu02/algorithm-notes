// 145. Binary Tree Postorder Traversal

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> post = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()) {
            TreeNode cur = stack.pop();
            if (cur == null)
                continue;
            post.addFirst(cur.val);
            stack.push(cur.left);
            stack.push(cur.right);
        }
        return post;
    }
}