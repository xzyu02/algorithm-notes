// 13. Roman to Integer

class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int prev = Integer.MAX_VALUE, sum = 0;
        for(int i = 0; i < s.length(); i++) {
            int cur = map.get(s.charAt(i));
            sum += cur;
            sum -= prev < cur ? 2 * prev : 0;
            prev = cur;
        }
        return sum;
    }
}