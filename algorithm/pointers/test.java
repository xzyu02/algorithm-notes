
public class test {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] a = new int[]{};
        a = s.twoSum(new int[]{1,2,3,4}, 5);
        for (int i : a)
            System.out.println(i);
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        if (nums == null) return null;
        int i = 0, j = nums.length - 1;
        while (i < j) {
            int sum = nums[i] + nums[j];
            if (sum == target) {
                return new int[]{i, j};
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }
        return null;
    }
}

