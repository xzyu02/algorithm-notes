// 199. Binary Tree Right Side View

class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            int n = queue.size();
            for(int i = 0; i < n; i++) {
                TreeNode cur = queue.poll();
                if (i == 0) {
                    res.add(cur.val);
                }
                if (cur.right != null) queue.add(cur.right);
                if (cur.left != null) queue.add(cur.left);
            }
        }
        return res;
    }
}