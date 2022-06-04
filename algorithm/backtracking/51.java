// 51. N-Queens

class Solution {
    private boolean[] col;
    private boolean[] diag1;
    private boolean[] diag2;
    private List<List<String>> res = new ArrayList<>();
        
    public List<List<String>> solveNQueens(int n) {
        col = new boolean[n];
        diag1 = new boolean[2*n-1];
        diag2 = new boolean[2*n-1];
        solve(0, n, new ArrayList<>());
        return res;
    }
    
    // int x = row index, int y = col index;
    private boolean available(int x, int y, int n) {
        return !col[y] && !diag1[x+y] && !diag2[x-y+n-1];
    }
    
    private void updateBoard(int x, int y, int n, boolean flag) {
        col[y] = flag;
        diag1[x+y] = flag;
        diag2[x-y+n-1] = flag;
    }
    
    private void solve(int x, int n, List<String> board) {
        if (x == n) {
            res.add(new ArrayList<>(board));
            return;
        }
        // iterate each column to find an available place
        for (int y = 0; y < n; y++) {
            if(!available(x, y, n)) {
                continue;
            }
            // create a row result
            char[] charArray = new char[n];
            Arrays.fill(charArray, '.');
            charArray[y] = 'Q';
            String str = new String(charArray);
            // add to result board, and update diag1, diag2, col
            board.add(str);
            updateBoard(x, y, n, true);
            
            // going to next row
            solve(x+1, n, board);
            
            // remove the last result previously added, and resume diag1, diag2, col
            board.remove(board.size() - 1);
            updateBoard(x, y, n, false);
        }
    }
}