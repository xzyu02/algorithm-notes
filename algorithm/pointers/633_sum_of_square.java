
class Solution {
    public boolean judgeSquareSum(int c) {
        // For those who receives wrong answers that shows not valide for 2147483600 
        // as input with using two pointers method. 
        // Simply replace int with long will resolve the issue.
        long i = 0, j = (int)Math.sqrt(c);
        while (i <= j) {
            long sum = i * i + j * j;
            if (sum == c) {
                return true;
            } else if (sum < c) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }
}