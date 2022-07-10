// 1696. Jump Game VI

class Solution {
    public int maxResult(int[] nums, int k) {
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(0);
        for(int i = 1; i < nums.length; i++) {
            if (queue.getFirst() < i - k) {
                queue.removeFirst();
            }
            nums[i] += nums[queue.getFirst()];
            while(!queue.isEmpty() && nums[queue.getLast()] <= nums[i]) {
                queue.removeLast();
            }
            queue.addLast(i);
        }
        return nums[nums.length-1];
    }
}