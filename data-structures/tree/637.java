// 637. Average of Levels in Binary Tree

class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> avg = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            double total = 0;
            int len = queue.size();
            for(int i = 0; i < len; i++) {
                TreeNode cur = queue.poll();
                total += cur.val;
                if (cur.left != null) queue.add(cur.left);
                if (cur.right != null) queue.add(cur.right);
            }
            avg.add(total/len);
        }
        return avg;
    }
}