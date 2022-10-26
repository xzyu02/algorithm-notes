// 2433. Find The Original Array of Prefix Xor

class Solution {
    public int[] findArray(int[] pref) {
        // inverse of xor is xor
        int[] nums = new int[pref.length];
        nums[0] = pref[0];
        for(int i = 1; i < pref.length; i++) {
            nums[i] = pref[i] ^ pref[i-1];
        }
        return nums;
    }
}