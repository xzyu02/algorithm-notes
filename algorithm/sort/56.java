// 56. Merge Intervals

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        LinkedList<int[]> arr = new LinkedList<>();
        for(int[] itv : intervals) {
            if (arr.isEmpty() || arr.getLast()[1] < itv[0]) {
                arr.add(itv);
            } else {
                arr.getLast()[1] = Math.max(itv[1], arr.getLast()[1]);
            }
        }
        return arr.toArray(new int[arr.size()][]);
    }
}