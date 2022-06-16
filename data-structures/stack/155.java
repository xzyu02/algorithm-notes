// 155. Min Stack

class MinStack {
    
    private Stack<Integer> stack, minStack;
    private int min;

    public MinStack() {
        min = Integer.MAX_VALUE;
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        min = Math.min(min, val);
        minStack.push(min);
    }
    
    public void pop() {
        stack.pop();
        minStack.pop();
        min = minStack.isEmpty() ? Integer.MAX_VALUE : minStack.peek();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}