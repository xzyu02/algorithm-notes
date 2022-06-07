// 88_merge_sorted_array
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len = m + n - 1;
        m = m - 1;
        n = n - 1;
        while (m >= 0 || n >= 0) {
            if (m < 0) {
                nums1[len--] = nums2[n--];
            } else if (n < 0) {
                nums1[len--] = nums1[m--];
            } else if (nums1[m] < nums2[n]) {
                nums1[len--] = nums2[n--];
            } else {
                nums1[len--] = nums1[m];
                nums1[m--] = 0;
            }
        }
    }
}