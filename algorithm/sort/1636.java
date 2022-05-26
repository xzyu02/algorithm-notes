// 1636_sort_arr_by_increment_fre
package sort;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int val : nums) {
            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        List<Integer>[] bucket = new List[nums.length + 1];
        for (int val : map.keySet()) {
            int fre = map.get(val);
            if (bucket[fre] == null)
                bucket[fre] = new ArrayList();
            bucket[fre].add(val);
        }

        int[] s = new int[nums.length];
        int pos = nums.length - 1;
        for (int i = bucket.length - 1; i > 0 && pos < 0; i--) {
            if (bucket[i] != null) {
                if (bucket[i].size() == 1) {
                    for (int j = i; j >= 0; j--) {
                        s[pos--] = bucket[i][0];
                    }
                } else {
                    Collections.sort(bucket[i]);
                    for (int val : bucket[i]) {
                        s[pos--] = val;
                    }
                }
            }
        }
        return s;
    }
}
