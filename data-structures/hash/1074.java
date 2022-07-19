// 1074. Number of Submatrices That Sum to Target

class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int k) {
        int m = matrix.length, n = matrix[0].length;
        for(int i = 0; i < m; i++)
            for(int j = 1; j < n; j++)
                matrix[i][j] += matrix[i][j-1];
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int cnt = 0;
        for(int start = 0; start < n; start++) {
            for(int end = start; end < n; end++) {
                int subSum = 0;
                map.clear();
                map.put(0, 1);
                for(int row = 0; row < m; row++) {
                    subSum += matrix[row][end] - (start > 0 ? matrix[row][start - 1] : 0);
                    if (map.containsKey(subSum - k)) {
                        cnt += map.get(subSum - k);
                    }
                    map.put(subSum, map.getOrDefault(subSum, 0) + 1);
                }
            }
        }
        return cnt;
    }
}