// 215_kth_lar_ele_arr
import java.util.Random;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}

class Solution {
    public int findKthLargest(int[] nums, int k) {
        int low = 0;
        int high = nums.length - 1;
        k = nums.length - k;
        while (low < high) {
            int p = partition(nums, low,  high);
            if (p == k) {
                return nums[p];
            } else if (p < k) {
                low = p + 1;
            } else {
                high = p - 1;
            }
        }
        return nums[k];
    }

    private int partition(int[] nums, int low, int high) {
        int pos = low;
        for (int i = low; i < nums.length; i++) {
            if (nums[i] < nums[high]) {
                swap(nums, i , pos++);
            }
        }
        swap(nums, pos, high);
        return pos;
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

}