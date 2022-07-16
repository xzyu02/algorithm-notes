// 576. Out of Boundary Paths

// dfs, TLE
class Solution {
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        if (row < 0 || row > m - 1 || col < 0 || col > n - 1) return 1;
        if (maxMove == 0) return 0;
        return dfs(m, n, maxMove - 1, row - 1, col) + dfs(m, n, maxMove - 1, row, col - 1) +
            dfs(m, n, maxMove - 1, row + 1, col) + dfs(m, n, maxMove - 1, row, col + 1);
    }
}

// dp
class Solution {
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        int mod = (int)1e9 + 7;
        int ret = 0;
        int[][] dp = new int[m][n];
        dp[startRow][startColumn] = 1;
        
        int[][] dirs = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
        
        int move = 1;
        while(move++ <= maxMove) {
            int[][] temp = new int[m][n];
            for(int i = 0; i < m; i++) {
                for(int j = 0; j < n; j++) {
                    // iterate 4 directions
                    for(int[] dir : dirs) {
                        int nextRow = i + dir[0];
                        int nextCol = j + dir[1];
                        if (nextRow < 0 || nextCol < 0 || nextRow > m-1 || nextCol > n-1) {
                            ret = (ret + dp[i][j]) % mod;
                        } else {
                            temp[nextRow][nextCol] = (temp[nextRow][nextCol] + dp[i][j]) % mod;
                        }
                    }
                }
            }
            dp = temp; // update for next move;
        }
        return ret;
    }
}