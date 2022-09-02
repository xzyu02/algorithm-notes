// 200. Number of Islands

class Solution {
    public int numIslands(char[][] grid) {
        int cnt = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    cnt++;
                    zeroOnes(grid, i, j);
                }
            }
        }
        return cnt;
    }
    
    private void zeroOnes(char[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length) return;
        if (grid[i][j] == '0') return;
        grid[i][j] = '0';
        zeroOnes(grid, i, j+1);
        zeroOnes(grid, i, j-1);
        zeroOnes(grid, i+1, j);
        zeroOnes(grid, i-1, j);
    }
}
