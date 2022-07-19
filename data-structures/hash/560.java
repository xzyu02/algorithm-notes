// 560. Subarray Sum Equals K

class Solution {
    public int subarraySum(int[] nums, int k) {
        int cnt = 0, sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // sum 0 with occurence 1
        for(int end = 0; end < nums.length; end++) {
            sum += nums[end];
            if (map.containsKey(sum - k)) {
                cnt += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return cnt;
    }
}