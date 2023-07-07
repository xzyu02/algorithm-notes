// 2471. Minimum Number of Operations to Sort a Binary Tree by Level

class Solution {
    public int minimumOperations(TreeNode root) {
        int res = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            ArrayList<Integer> list = new ArrayList<>();
            while (size-- > 0) {
                TreeNode cur = queue.poll();
                if (cur.left != null) {
                    queue.add(cur.left);
                    list.add(cur.left.val);
                }
                if (cur.right != null) {
                    queue.add(cur.right);
                    list.add(cur.right.val);
                }
            }
            res += minSwap(list);
        }
        return res;
    }
    
    private int minSwap(List<Integer> arr) {
        int swaps = 0;
        int n = arr.size();
        int[] sorted = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            sorted[i] = arr.get(i);
            map.put(arr.get(i), i);
        }
        Arrays.sort(sorted);
        for (int i = 0; i < n; i++) {
            int before = arr.get(i);
            int after = sorted[i];
            if (before != after) {
                swaps++;
                map.put(before, map.get(after));
                arr.set(map.get(after), before);
            }
        }
        return swaps;
    }
}