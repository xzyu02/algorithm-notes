// 315. Count of Smaller Numbers After Self

class arrayWithIdx {
    int val, idx;
    
    arrayWithIdx(int val, int idx) {
        this.val = val;
        this.idx = idx;
    }
}

class Solution {
    public List<Integer> countSmaller(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new LinkedList<Integer>();
        }
        int n = nums.length;
        int[] result = new int[n];
        // initialize new nums
        arrayWithIdx[] numsWithIdx = new arrayWithIdx[n];
        for(int i = 0; i < n; i++) {
            numsWithIdx[i] = new arrayWithIdx(nums[i], i);
        }
        // merge sort and count smaller numbers
        merge(numsWithIdx, 0, n-1, result);
        // copy result to List
        List<Integer> ret = new LinkedList<>();
        for(int i : result) ret.add(i);
        return ret;
    }
    
    public void merge(arrayWithIdx[] nums, int start, int end, int[] result) {
        // base case
        if (start >= end) return;
        // devide
        int mid = (start + end) / 2;
        merge(nums, start, mid, result);
        merge(nums, mid+1, end, result);
        // conquer
        int leftIdx = start;
        int rightIdx = mid+1;
        List<arrayWithIdx> merged = new LinkedList<>();
        int numsOnRightLessThanLeft = 0;
        // merge sort when both arrays are not empty yet
        while (leftIdx <= mid && rightIdx <= end) {
            if (nums[leftIdx].val > nums[rightIdx].val) {
                numsOnRightLessThanLeft++; // record numbers of smaller nums
                merged.add(nums[rightIdx]); // add smallest num to merge array
                rightIdx++; // right position changes
            } else {
                result[nums[leftIdx].idx] += numsOnRightLessThanLeft; // count
                merged.add(nums[leftIdx]); // merge
                leftIdx++; // increase position
            }
        }
        // left array is empty, add count and move to merged array
        while (leftIdx <= mid) {
            result[nums[leftIdx].idx] += numsOnRightLessThanLeft;
            merged.add(nums[leftIdx]);
            leftIdx++;
        }
        // right array is empty, no need to count, move to merged array
        while (rightIdx <= end) {
            merged.add(nums[rightIdx]);
            rightIdx++;
        }
        // copy merged array to nums
        int pos = start;
        for(arrayWithIdx i : merged) nums[pos++] = i;
    }
}