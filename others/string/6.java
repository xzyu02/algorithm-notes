// 6. Zigzag Conversion

class Solution {
    public String convert(String s, int numRows) {
        if (numRows <= 1) return s;
        StringBuffer[] strs = new StringBuffer[numRows];
        for (int i = 0; i < strs.length; i++) strs[i] = new StringBuffer();
        int pos = 0, step = 1;
        for(int i = 0; i < s.length(); i++) {
            strs[pos].append(s.charAt(i));
            if (pos == numRows - 1) step = -1;
            if (pos == 0) step = 1;
            pos += step;
        }
        String ret = "";
        for(StringBuffer sb : strs) {
            ret += sb.toString();
        }
        return ret;
    }
}