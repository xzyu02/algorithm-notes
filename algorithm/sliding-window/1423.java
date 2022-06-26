// 1423. Maximum Points You Can Obtain from Cards

class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int left = 0, right = 0;
        for (int i = 0; i < k; i++) {
            left += cardPoints[i];
        }
        int max = left + right;
        for (int lo = k - 1, hi = cardPoints.length - 1; lo >= 0; lo--, hi--) {
            right += cardPoints[hi];
            left -= cardPoints[lo];
            max = Math.max(max, left + right);
        }
        return max;
    }
}