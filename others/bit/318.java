// 318. Maximum Product of Word Lengths

class Solution {
    public int maxProduct(String[] words) {
        int[] mask = new int[words.length];
        for(int i = 0; i < mask.length; i++) {
            for(char c : words[i].toCharArray()) {
                mask[i] |= (1 << (c - 'a'));
            }
        }
        int max = 0;
        for(int diff = 1; diff < mask.length; diff++) {
            for(int i = 0; i < mask.length - diff; i++) {
                int j = i + diff;
                if ((mask[i] & mask[j]) == 0) {
                    max = Math.max(words[i].length() * words[j].length(), max);
                }
            }
        }
        return max;
    }
}