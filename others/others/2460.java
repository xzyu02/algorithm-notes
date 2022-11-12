// 2460. Apply Operations to an Array

class Solution {
    public int[] applyOperations(int[] nums) {
        int zeros = 0;
        int n = nums.length;
        ArrayList<Integer> arr = new ArrayList<>();
        int i = 0;
        while(i < n - 1) {
            if (nums[i] != 0) {
                if (nums[i] == nums[i+1]) {
                    nums[i] *= 2;
                    nums[i+1] = 0;
                }
                arr.add(nums[i]);
            }
            if (nums[i] == 0) {
                zeros += 1;
            }
            i++;
        }
        arr.add(nums[i]);
        while(zeros-- > 0) {
            arr.add(0);
        }
        return arr.stream().mapToInt(j -> j).toArray();
    }
}