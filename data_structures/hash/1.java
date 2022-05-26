// 1_Two_Sum
import java.util.HashMap;

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            Integer diff = target - nums[i];
            if (h.containsKey(diff)) {
                if (diff < nums[i]) {
                    return new int[]{h.get(diff), i};
                } else {
                    return new int[]{i, h.get(diff)};
                }
            }
            h.put(nums[i], i);
        }
        return null;
    }
}

