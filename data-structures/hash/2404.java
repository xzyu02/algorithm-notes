// 2404. Most Frequent Even Element

class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int key = -1, freq = -1;
        for(int num : nums) {
            if (num % 2 == 0) {
                map.put(num, map.getOrDefault(num, 0) + 1);
                if (map.get(num) > freq || key == -1) {
                    key = num;
                    freq = map.get(num);
                } else if (map.get(num) == freq) {
                    key = Math.min(num, key);
                }
            }
        }
        return key;
    }
}