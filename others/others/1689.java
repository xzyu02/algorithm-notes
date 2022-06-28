// 1689. Partitioning Into Minimum Number Of Deci-Binary Numbers

class Solution {
    public int minPartitions(String n) {
        int cur = 0;
        for (int i = 0; i < n.length() && cur != 9; i++)
            cur = Math.max(cur, n.charAt(i) - '0');
        return cur;
    }
}