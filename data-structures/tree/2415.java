// 2415. Reverse Odd Levels of Binary Tree

class Solution {
    public TreeNode reverseOddLevels(TreeNode root) {
        int level = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            // if is odd level
            boolean flag = (level % 2 == 1);
            ArrayList<TreeNode> arr = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode cur = queue.poll();
                if (cur.left != null) queue.add(cur.left);
                if (cur.right != null) queue.add(cur.right);
                if (flag) arr.add(cur); // when odd level, add to array
            }
            // exchange values
            for (int i = 0, j = arr.size() - 1; i < j; i++, j--) {
                int temp = arr.get(i).val;
                arr.get(i).val = arr.get(j).val;
                arr.get(j).val = temp;
            }
            level++;
        }
        return root;
    }
}