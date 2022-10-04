// 443. String Compression

class Solution {
    public int compress(char[] chars) {
        int i = 0, strLen = 0;
        while (i < chars.length) {
            int count = 0;
            char c = chars[i]; // current char
            while (i < chars.length && chars[i] == c) {
                count += 1;
                i++;
            }
            // update chars array
            chars[strLen++] = c;
            if (count != 1) {
                for(char ch : Integer.toString(count).toCharArray()) {
                    chars[strLen++] = ch;
                }
            }
        }
        return strLen;
    }
}