// 118. Pascal's Triangle
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ret = new ArrayList<>();
        int[] nums = new int[numRows + 1];
        nums[1] = 1;
        ret.add(Arrays.asList(1));
        for (int row = 2; row <= numRows; row++) {
            List<Integer> cur = new ArrayList<>();
            for (int i = row; i > 0; i--) {
                nums[i] = nums[i] + nums[i-1];
                cur.add(nums[i]);
            }
            ret.add(cur);
        }
        return ret;
    }
}