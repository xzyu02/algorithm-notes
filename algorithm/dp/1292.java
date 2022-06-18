// 1292. Maximum Side Length of a Square with Sum Less than or Equal to Threshold

class Solution {
    public int maxSideLength(int[][] mat, int threshold) {
        int[][] sum = new int[mat.length + 1][mat[0].length + 1];
        int max = 0;
        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat[0].length; j++) {
                sum[i+1][j+1] = mat[i][j] + sum[i+1][j] + sum[i][j+1] - sum[i][j];
                if (i >= max && j >= max &&
                   sum[i+1][j+1] - sum[i-max][j+1] - sum[i+1][j-max] + sum[i-max][j-max] <= threshold) {
                    max++;
                }
            }
        }
        return max;
    }
}