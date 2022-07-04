// 135. Candy

class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] ret = new int[n];
        Arrays.fill(ret, 1);
        // iterate from left to ensure every element larger than left children should +1
        for(int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i-1]) {
                ret[i] = ret[i-1] + 1;
            }
        }
        // iterate from right
        int sum = ret[n-1];
        for(int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i+1]) {
                ret[i] = Math.max(ret[i], ret[i+1]+1);
            }
            sum += ret[i];
        }
        return sum;
    }
}