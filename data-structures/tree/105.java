// 105. Construct Binary Tree from Preorder and Inorder Traversal

class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(0, 0, inorder.length-1, preorder, inorder);
    }
    
    public TreeNode helper(int preIdx, int inLeft, int inRight, int[] preorder, int[] inorder) {
        if (preIdx > preorder.length - 1 || inLeft > inRight) return null;
        TreeNode root = new TreeNode(preorder[preIdx]);
        int inIdx = 0;
        for(int i = inLeft; i <= inRight; i++) {
            if (inorder[i] == root.val) {
                inIdx = i;
            }
        }
        root.left = helper(preIdx + 1, inLeft, inIdx - 1, preorder, inorder);
        root.right = helper(preIdx + inIdx - inLeft + 1, inIdx + 1, inRight, preorder, inorder);
        return root;
    }
}