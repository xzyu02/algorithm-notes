// 347_top_k_frequent
import java.util.HashMap;
import java.util.ArrayList;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int val : nums) {
            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        List<Integer>[] bucket = new List[nums.length + 1]; // consider [1], frequency 1 is out of bound
        for (int key : map.keySet()) {
            int frequency = map.get(key);
            if (bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        }

        int[] vals = new int[k];
        int pos = 0;
        for (int i = bucket.length - 1; pos != k && i >= 0; i--) {
            if(bucket[i] != null && pos < k){
                for(int v : bucket[i]) {
                    if (pos < k) {
                        vals[pos++] = v;
                    }
                }
            }
        }

        return vals;
    }
}