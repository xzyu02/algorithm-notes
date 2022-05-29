// 268. Missing Number

// math approach
class Solution {
    public int missingNumber(int[] nums) {
        int miss = nums.length;
        for (int i = 0; i < nums.length; i++)
            miss += i - nums[i];
        return miss;
    }
}

// XOR approach
class Solution {
    public int missingNumber(int[] nums) {
        int xor = nums.length;
        for (int i = 0; i < nums.length; i++)
            xor = xor ^ i ^ nums[i];
        return xor;
    }
}