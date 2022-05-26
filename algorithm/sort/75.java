// 75_sort_colors
package sort;

class Solution {
    public void sortColors(int[] nums) {
        int zero = -1, one = 0, two = nums.length;
        while (one < two) {
            if (nums[one] == 2) {
                swap(nums, one, --two);
            } else if (nums[one] == 0) {
                swap(nums, ++zero, one++);
            } else {
                one++;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}