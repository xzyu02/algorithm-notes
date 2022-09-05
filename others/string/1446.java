// 1446. Consecutive Characters

class Solution {
    public int maxPower(String s) {
        int prev = -1;
        int max = 0, curMax = 0;
        for(char c : s.toCharArray()) {
            if (prev == -1 || prev != c) {
                curMax = 1;
            } else {
                curMax++;
            }
            prev = c;
            max = Math.max(max, curMax);
        }
        return max;
    }
}