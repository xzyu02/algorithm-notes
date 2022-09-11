// 20. Valid Parentheses

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false; // left brackets less than right ones
                char cur = stack.pop();
                boolean f1 = cur == '(' && c == ')';
                boolean f2 = cur == '{' && c == '}';
                boolean f3 = cur == '[' && c == ']';
            if (!f1 && !f2 && !f3) return false;
            }
        }
        return stack.isEmpty();
    }
}