// 2405. Optimal Partition of String
class Solution {
    public int partitionString(String s) {
        HashSet<Character> map = new HashSet<>();
        int cnt = 1;
        for(char c : s.toCharArray()) {
            if (map.contains(c)) {
                map.clear();
                cnt++;
            }
            map.add(c);
        }
        return cnt;
    }
}