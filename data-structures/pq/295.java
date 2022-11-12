// 295. Find Median from Data Stream

class MedianFinder {
    PriorityQueue<Integer> leftMaxTop, rightSmallTop;
    boolean even;
    
    public MedianFinder() {
        leftMaxTop = new PriorityQueue<>(Collections.reverseOrder());
        rightSmallTop = new PriorityQueue<>();
        even = true;
    }
    
    public void addNum(int num) {
        if (even) {
            leftMaxTop.offer(num);
            rightSmallTop.offer(leftMaxTop.poll());
        } else {
            rightSmallTop.offer(num);
            leftMaxTop.offer(rightSmallTop.poll());
        }
        even = !even;
    }
    
    public double findMedian() {
        if (even) {
            return (leftMaxTop.peek() + rightSmallTop.peek()) / 2.0;
        } else {
            return rightSmallTop.peek() / 1.0;
        }
    }
}
