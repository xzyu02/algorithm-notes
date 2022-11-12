// 2462. Total Cost to Hire K Workers

class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        long sum = 0;
        PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>();
        PriorityQueue<Integer> pq2 = new PriorityQueue<Integer>();
        int n = costs.length;
        int i1 = 0, i2 = n - 1;
        while (i1 < candidates) {
            pq1.add(costs[i1++]);
            if (i2 > i1) {
                pq2.add(costs[i2--]);
            } else {
                break;
            }
        }
        
        Deque<Integer> mid = new LinkedList<Integer>();
        while (i1 <= i2) {
            mid.add(costs[i1++]);
        }

        while(k-- > 0) {
            boolean ispq1 = true;
            int val1 = pq1.size() > 0 ? pq1.peek() : Integer.MAX_VALUE;
            int val2 = pq2.size() > 0 ? pq2.peek() : Integer.MAX_VALUE;

            if (val1 < val2) {
                sum += pq1.poll();
            } else if (val1 > val2) {
                ispq1 = false;
                sum += pq2.poll();
            } else if (val1 == val2 && val1 != Integer.MAX_VALUE) {
                sum += pq1.poll();
            }
            if (mid.size() > 0) {
                if (ispq1) {
                    pq1.add(mid.removeFirst());
                } else {
                    pq2.add(mid.removeLast());
                }
            }
        }
        return sum;
    }
}