// 2406. Divide Intervals Into Minimum Number of Groups

class Solution {
    public int minGroups(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(intervals[0][1]);
        for(int i = 1; i < intervals.length; i++) {
            int left = intervals[i][0], right = intervals[i][1];
            if (left > pq.peek()) {
                pq.poll();
            }
            pq.add(right);
        }
        return pq.size();
    }
}