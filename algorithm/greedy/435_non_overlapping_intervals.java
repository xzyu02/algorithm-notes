package greedy;
import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        // Arrays.sort(intervals, Comparator.comparingInt(a -> a[1]));
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return (a[1] < b[1]) ? -1 : (a[1] == b[1]) ? 0 : 1;
            }
        });
        int nonOverlap = 1;
        int pos2 = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < pos2) {
                continue;
            } else {
                pos2 = intervals[i][1];
                nonOverlap++;
            }
        }
        return intervals.length - nonOverlap;
    }
}