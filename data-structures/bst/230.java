// 230. Kth Smallest Element in a BST

class Solution {
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();
        // start from smallest element
        while (root != null) {
            stack.push(root);
            root = root.left;
        }
        // find kth element
        while (k > 0) {
            TreeNode cur = stack.pop();
            k--;
            if (k == 0) {
                return cur.val;
            }
            TreeNode right = cur.right;
            while (right != null) {
                stack.push(right);
                right = right.left;
            }
        }
        return -1;
    }
}