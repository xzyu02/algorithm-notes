// 7. Reverse Integer

class Solution {
    public int reverse(int x) {
        int ret = 0;
        while(x != 0) {
            int prevRet = ret;
            int reminder = x % 10;
            ret = ret * 10 + reminder;
            // overflow
            if ((ret / 10 ) != prevRet) {
                return 0;
            }
            x = x / 10;
        }
        return ret;
    }
}