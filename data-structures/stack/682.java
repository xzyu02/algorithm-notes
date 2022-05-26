// 682 Baseball Game

class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> scores = new Stack<>();
        int sum = 0;
        for (String i : ops) {
            int len = scores.size();
            switch (i) {
                case "C":
                    sum -= scores.pop();
                    break;
                case "D":
                    sum += scores.push(scores.peek() * 2);
                    break;
                case "+":
                    int top = scores.pop();
                    int next = top + scores.peek();
                    scores.push(top);
                    sum += scores.push(next);
                    break;
                default:
                    sum += scores.push(Integer.parseInt(i));
            }
        }

        return sum;
    }
}