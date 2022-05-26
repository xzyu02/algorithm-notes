// 354. Russian Doll Envelopes

class Solution {
    public int maxEnvelopes(int[][] envelopes) {  
        Arrays.sort(envelopes, (a, b) -> (a[0] == b[0]) ? b[1] - a[1] : a[0] - b[0]); 
        int[] dp = new int[envelopes.length];
        int size = 0;
        for(int[] envelope: envelopes) {
            // binary search
            int i = 0, j = size;     // j = size
            while (i < j) {
                int m = (i + j) / 2;
                if (dp[m] < envelope[1]) {
                    i = m + 1;
                } else {
                    j = m;
                }
            }
            // left is the right position to 'replace' in dp array
            dp[i] = envelope[1];
            if(i == size) size++;
        }
        return size;
    }
}