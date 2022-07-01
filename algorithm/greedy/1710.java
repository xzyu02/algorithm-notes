// 1710. Maximum Units on a Truck

import java.util.Arrays;


class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> a[1] != b[1] ? b[1] - a[1] : b[0] - a[0]);
        int ret = 0;
        for(int[] box : boxTypes) {
            if (truckSize <= 0) {
                return ret;
            }
            ret += truckSize >= box[0] ? box[0] * box[1] : truckSize * box[1];
            truckSize -= box[0];
        }
        return ret;
    }
}