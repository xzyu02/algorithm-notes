// 1630_Arithmetic_Subarrays

class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> ret = new ArrayList<>();
        for (int i = 0; i < l.length; i++) {
            ret.add(isArith(nums, l[i], r[i]));
        }
        return ret;
    }
    
    private Boolean isArith(int[] nums, int l, int r) {
        if (r - l <= 1) return true;
        // save values in array
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        HashSet<Integer> set = new HashSet<>();
        for (int i = l; i <= r; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
            set.add(nums[i]);
        }
        // corner case
        if (min == max) return true;
        // arithmetic rule case
        if ((max - min) % (r - l) != 0) return false;
        // compute
        int step = (max - min) / (r - l);
        for(int i = min; i <= max; i += step){
            if (!set.contains(i)) return false;
        }
        return true;
    }
}