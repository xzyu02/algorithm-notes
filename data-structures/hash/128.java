// 128. Longest Consecutive Sequence

class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums) set.add(i);
        int max = 0;
        for(int i : nums) {
            if (!set.contains(i)) continue;
            int left = i - 1, right = i + 1;
            set.remove(i);
            while(set.contains(left)) {
                set.remove(left--);
            }
            while(set.contains(right)) {
                set.remove(right++);
            }
            max = Math.max(max, right-left-1);
        }
        return max;
    }
}