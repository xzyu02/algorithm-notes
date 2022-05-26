// 451_sort_characters_by_freq
import java.util.HashMap;

class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char a : s.toCharArray()) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }

        List<Character>[] bucket = new List[s.length() + 1];
        for (char a : map.keySet()) {
            int fre = map.get(a);
            if (bucket[fre] == null) {
                bucket[fre] = new ArrayList<Character>();
            }
            bucket[fre].add(a);
        }

        StringBuilder str = new StringBuilder();
        for (int i = bucket.length - 1; i >= 0 ; i--) {
            if (bucket[i] != null) {
                for (char a : bucket[i]) {
                    for (int j = 0; j < i; j++)
                        str.append(a);
                }
            }
        }
        return str.toString();
    }
}