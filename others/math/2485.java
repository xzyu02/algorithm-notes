// 2485. Find the Pivot Integer

class Solution {
    public int pivotInteger(int n) {
        int left = 0, right = n * (n + 1) / 2;
        for (int i = 1; i <= n; i++) {
            left += i;
            // System.out.println("[" + left + "," + right + "]");
            if (left == right) return i;
            right -= i;
        }
        return -1;
    }
}