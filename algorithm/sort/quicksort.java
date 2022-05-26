public class quicksort {
    public void sort(int[] arr, int low, int high) {
        if (low < high) {
            pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);  // Before pi
            quickSort(arr, pi + 1, high); // After pi
        }
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
