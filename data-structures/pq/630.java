// 630. Course Schedule III

class Solution {
    public int scheduleCourse(int[][] courses) {
        Arrays.sort(courses, (a,b) -> a[1] - b[1]); // greedy, sort by deadline
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        int time = 0;
        for(int[] cur : courses) {
            int duration = cur[0];
            time += duration;
            pq.add(duration);
            if (time > cur[1]) {
                time -= pq.poll(); // remove the longest course added earlier
            }
        }
        return pq.size();
    }
}