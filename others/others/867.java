// 867. Transpose Matrix

class Solution {
    public int[][] transpose(int[][] matrix) {
        int[][] t = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[0].length; j++) {
                t[i][j] = matrix[j][i];
            }
        }
        return t;
    }
}