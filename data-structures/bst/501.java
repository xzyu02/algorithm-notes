// 501. Find Mode in Binary Search Tree

class Solution {
    private TreeNode pre = null;
    private int max = 1;
    private int cnt = 1; // counts for leftmost node self
    
    public int[] findMode(TreeNode root) {
        List<Integer> nums = new ArrayList<>();
        inOrder(root, nums);
        int[] arr = new int[nums.size()];
        for (int i = 0; i < nums.size(); i++) arr[i] = nums.get(i);
        return arr;
    }
    
    private void inOrder(TreeNode root, List<Integer> nums) {
        if (root == null) {
            return;
        }
        // in-order traversal, left-root-right
        inOrder(root.left, nums);
        // if consecutive integers are the same
        if (pre != null) {
            cnt = (pre.val == root.val) ? cnt + 1 : 1;
        }
        // if current value's frequency is larger than the max one
        if (cnt > max) {
            max = cnt;
            nums.clear();
            nums.add(root.val);
        } else if (cnt == max) {
            // frequency equals, add current root value
            nums.add(root.val);
        }
        pre = root; // update pre node
        inOrder(root.right, nums); // in-order
    }
}