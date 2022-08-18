// 4. Median of Two Sorted Arrays

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length, n2 = nums2.length;
        if (n1 > n2) {
            return findMedianSortedArrays(nums2, nums1); // exchange for faster computation     
        }
        int k = (n1 + n2 + 1) / 2; // number of elements to use
        int l = 0, r = n1; // left and right pointers
        // binary search correct median pos
        while (l < r) {
            int m1 = (l + r) / 2; // number of elements nums1 needs
            int m2 = k - m1; // number of elements nums2 needs
            if (nums1[m1] < nums2[m2 - 1]) {
                l = m1 + 1; // nums1 should use more elements
            } else {
                r = m1; // nums2 should use more elements
            }
        }
        int m1 = l, m2 = k - m1;
        // retrieve median
        int a1 = m1 > 0 ? nums1[m1 - 1] : Integer.MIN_VALUE;
        int b1 = m2 > 0 ? nums2[m2 - 1] : Integer.MIN_VALUE;
        int c1 = Math.max(a1, b1);
        // odd condition
        if ((n1 + n2) % 2 == 1) {
            return c1;
        }
        // retrieve next median for even condition
        int a2 = m1 < n1 ? nums1[m1] : Integer.MAX_VALUE;
        int b2 = m2 < n2 ? nums2[m2] : Integer.MAX_VALUE;
        int c2 = Math.min(a2, b2);
        return (c1 + c2) / 2.0;
    }
}