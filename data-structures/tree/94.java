// 94. Binary Tree Inorder Traversal

// Easy to think solution, applied in 230.
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while(root != null) {
            stack.push(root);
            root = root.left;
        }
        while(!stack.isEmpty()) {
            TreeNode cur = stack.pop();
            if (cur == null) 
                continue;
            ans.add(cur.val);
            TreeNode right = cur.right;
            while (right != null) {
                stack.push(right);
                right = right.left;
            }
        }
        return ans;
    }
}

// more concise solution
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while(cur != null || !stack.isEmpty()) {
            while(cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            ans.add(cur.val);
            cur = cur.right;
        }
        return ans;
    }
}