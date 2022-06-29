// 406. Queue Reconstruction by Height


import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[][] reconstructQueue(int[][] people) {
        // sort height by decending order, then sort by k, ascending order
        Arrays.sort(people, (a, b) -> a[0] != b[0] ? b[0] - a[0] : a[1] - b[1]);
        ArrayList<int[]> p = new ArrayList<>();
        for(int[] cur : people) {
            p.add(cur[1], cur);
        }
        return p.toArray(new int[people.length][2]);
    }
}
