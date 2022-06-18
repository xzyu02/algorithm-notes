// 503. Next Greater Element II

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> idx = new Stack<>();
        int[] ret = new int[nums.length];
        Arrays.fill(ret, -1);
        for(int i = 0 ; i < nums.length * 2; i++) {
            int cur = i % nums.length;
            while(!idx.isEmpty() && nums[idx.peek()] < nums[cur]) {
                ret[idx.pop()] = nums[cur];
            }
            if (i < nums.length) {
                idx.push(i);
            }
        }
        return ret;
    }
}