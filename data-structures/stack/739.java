// 739. Daily Temperatures

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Stack<Integer> idx = new Stack<>();
        for(int i = 0; i < temperatures.length; i++) {
            while(!idx.isEmpty() && temperatures[i] > temperatures[idx.peek()]) {
                int prev = idx.pop();
                res[prev] = i - prev;
            }
            idx.push(i);
        }
        return res;
    }
}