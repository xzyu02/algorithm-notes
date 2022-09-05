// 1472. Design Browser History

class BrowserHistory {
    Stack<String> left, right;
    
    public BrowserHistory(String homepage) {
        left = new Stack<>();
        right = new Stack<>();
        left.push(homepage);
    }
    
    public void visit(String url) {
        left.push(url);
        right.clear();
    }
    
    public String back(int steps) {
        while(steps > 0 && left.size() > 1) {
            right.push(left.pop());
            steps--;
        }
        return left.peek();
    }
    
    public String forward(int steps) {
        while(steps > 0 && !right.isEmpty()) {
            left.push(right.pop());
            steps--;
        }
        return left.peek();
    }
}