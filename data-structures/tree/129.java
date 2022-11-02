// 129. Sum Root to Leaf Numbers

class Solution {
    public int sumNumbers(TreeNode root) {
        return sum(root, 0);
    }
    
    private int sum(TreeNode root, int total) {
        if (root == null) return 0;
        int curSum = total * 10 + root.val;
        if (root.left == null && root.right == null) return curSum;
        return sum(root.left, curSum) + sum(root.right, curSum);
    }
}