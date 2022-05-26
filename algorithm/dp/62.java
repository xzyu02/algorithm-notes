// 62_Unique_Paths

class Solution {
    public int uniquePaths(int m, int n) {
        int[][] nums = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                    nums[i][j] = 1;
                } else {
                    nums[i][j] = nums[i][j-1] + nums[i-1][j];
                }  
            }   
        }
        return nums[m-1][n-1];
    }
}