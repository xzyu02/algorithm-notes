// 1461. Check If a String Contains All Binary Codes of Size K

class Solution {
    public boolean hasAllCodes(String s, int k) {
        HashSet<String> possibleSolutions = new HashSet<>();
        for(int i = 0; i + k <= s.length(); i++) {
            possibleSolutions.add(s.substring(i, i+k));
        }
        return possibleSolutions.size() == 1 << k;
    }
}