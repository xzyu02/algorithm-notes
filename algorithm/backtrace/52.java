// 52. N-Queens II

class Solution {
    private int uniqueSolutions = 0;
    private boolean[] col, diag1, diag2;
    
    public int totalNQueens(int n) {
        col = new boolean[n];
        diag1 = new boolean[n*2-1];
        diag2 = new boolean[n*2-1];
        solve(0, n);
        return uniqueSolutions;
    }
    
    private void updateAvail(int x, int y, int n, boolean flag) {
        col[y] = flag;
        diag1[x+y] = flag;
        diag2[x-y+n-1] = flag;
    }
    
    private void solve(int x, int n) {
        if (x == n) {
            uniqueSolutions += 1;
            return;
        } 
        for (int y = 0; y < n; y++) {
            if (col[y] || diag1[x+y] || diag2[x-y+n-1]) {
                continue; // this column/diag is not available
            }
            updateAvail(x, y, n, true);
            solve(x+1, n);
            updateAvail(x, y, n, false);
        }
    }
}