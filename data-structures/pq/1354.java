// 1354. Construct Target Array With Multiple Sums

class Solution {
    public boolean isPossible(int[] target) {
        if (target.length == 1) return target[0] == 1; // corner case
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int total = 0;
        for(int i : target) {
            pq.add(i);
            total += i;
        }
        while(pq.peek() != 1) {
            int cur = pq.poll();
            total -= cur; // record sum of rest nums
            int x = cur % total;
            if (total == 1) {
                return true;
            }
            if (x == 0 || x == cur) {
                return false; // cur <= total
            }
            pq.add(x);
            total += x;
        }
        return true;
    }
}