// 1046_Last_Stone_Weight

class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i : stones) {
            pq.add(i);
        }
        int x, y;
        while (pq.size() > 1) {
            x = pq.poll();
            y = pq.poll();
            if (x != y) {
                pq.add(x - y);
            }
        }
        if (pq.isEmpty()) {
            return 0;
        }
        return pq.poll();
    }
}