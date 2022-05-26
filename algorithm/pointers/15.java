// 15. 3Sum

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> sum3 = new ArrayList<>();
        int n = nums.length;
        // edge case
        if (n < 3) {
            return sum3;
        }
        Arrays.sort(nums);
        for (int i = 0; i < n - 2; i++) {
            if (nums[i] > 0) {
                break; // array is sorted, if nums[i] > 0, then it's impossible to get 0
            }
            if (i != 0 && nums[i] == nums[i-1]) {
                continue;
            }
            int ret = 0 - nums[i];
            // use two pointers to find sum
            int pnt1 = i + 1;
            int pnt2 = n - 1;
            while (pnt1 < pnt2) {
                int sum = nums[pnt1] + nums[pnt2];
                if (sum == ret) {
                    sum3.add(Arrays.asList(nums[i], nums[pnt1], nums[pnt2]));
                    // jump duplicated values
                    // use pnt1 < pnt2 to avoid index out of bound
                    while(pnt1 < pnt2 && nums[pnt1] == nums[pnt1+1]) pnt1++;
                    while(pnt1 < pnt2 && nums[pnt2] == nums[pnt2-1]) pnt2--;
                    pnt1++;
                    pnt2--;
                } else if(sum > ret) {
                    pnt2--;
                } else {
                    pnt1++;
                }
            }
        }
        return sum3;
    }
}