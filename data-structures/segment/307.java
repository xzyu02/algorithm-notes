// 307. Range Sum Query - Mutable

class NumArray {
    public int[] nums;
    private SegmentNode tree;

    public NumArray(int[] nums) {
        this.nums = nums;
        this.tree = build(0, nums.length - 1);
    }
    
    public void update(int index, int val) {
        update(tree, index, val);
    }
    
    public int sumRange(int left, int right) {
        return querySum(tree, left, right);
    }
    
    class SegmentNode {
        int start, end;
        int sum;
        SegmentNode left, right;
        
        SegmentNode(int start, int end) {
            this.start = start;
            this.end = end;
            this.sum = 0;
            this.left = null;
            this.right = null;
        }
    }
    
    private SegmentNode build(int start, int end) {
        if (end < start) return null;
        SegmentNode node = new SegmentNode(start, end);
        if (start == end) {
            node.sum = nums[start];
            return node;
        }
        int mid = (start + end) / 2;
        node.left = build(start, mid);
        node.right = build(mid + 1, end);
        node.sum = node.left.sum + node.right.sum;
        return node;
    }
    
    private void update(SegmentNode root, int i, int val) {
        if (root.start == root.end && root.start == i) {
            root.sum = val;
            return;
        }
        int mid = (root.start + root.end) / 2;
        if (i <= mid) {
            update(root.left, i, val);
        } else {
            update(root.right, i, val);
        }
        root.sum = root.left.sum + root.right.sum;
    }
    
    private int querySum(SegmentNode root, int start, int end) {
        if (root.start == start && root.end == end) {
            return root.sum;
        }
        int mid = (root.start + root.end) / 2;
        if (end <= mid) {
            return querySum(root.left, start, end);
        } else if (start > mid) {
            return querySum(root.right, start, end);
        } else {
            return querySum(root.left, start, mid) + querySum(root.right, mid+1, end);
        }
    } 
}