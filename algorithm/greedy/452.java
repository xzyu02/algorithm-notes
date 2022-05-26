// 452_minimum_number_of_arrow
package greedy;

import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(a -> a[1]));
        int pos = points[0][1];
        int nonOverlap = 1;
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] <= pos) {
                continue;
            } else {
                pos = points[i][1];
                nonOverlap++;
            }
        }
        return nonOverlap;
    }
}