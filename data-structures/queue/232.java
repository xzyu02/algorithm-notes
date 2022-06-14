// 232. Implement Queue using Stacks

class MyQueue {
    
    private Stack<Integer> in, out;

    public MyQueue() {
        in = new Stack<>();
        out = new Stack<>();
    }
    
    public void push(int x) {
        in.push(x);
    }
    
    public int pop() {
        inToOut();
        return out.pop();
    }
    
    public int peek() {
        inToOut();
        return out.peek();
    }
    
    private void inToOut() {
        if (!out.isEmpty()) return;
        while(!in.isEmpty()) {
            out.push(in.pop());
        }
    }
    
    public boolean empty() {
        return in.isEmpty() && out.isEmpty();
    }
}