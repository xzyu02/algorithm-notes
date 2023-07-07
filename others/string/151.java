// 151. Reverse Words in a String

class Solution {
    public String reverseWords(String s) {
        s = s.strip();
        String[] strs = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = strs.length - 1; i >= 0; i--) {
            if (strs[i].strip().isEmpty()) {
                continue;
            }
            sb.append(strs[i]);
            if (i == 0) {
                break;
            }
            sb.append(" ");
        }
        return sb.toString();
    }
}