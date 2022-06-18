// 594. Longest Harmonious Subsequence

class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for(int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
            if (map.containsKey(i+1)) {
                res = Math.max(res, map.get(i) + map.get(i+1));
            }
            if (map.containsKey(i-1)) {
                res = Math.max(res, map.get(i) + map.get(i-1));
            }
        }
        return res;
    }
}