class Solution:
    def invertTree(self, root: Optional[TreeNode]) -> Optional[TreeNode]:
        if root == None:
            return root
        left = self.invertTree(root.right)
        right = self.invertTree(root.left)
        root.left, root.right = left, right
        return root