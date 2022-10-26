// 2434. Using a Robot to Print the Lexicographically Smallest String

class Solution {
    public String robotWithString(String s) {
        if (s.length() == 0) return "";
        
        Stack<Character> t = new Stack<>();
        int[] freq = new int[26];
        for(char c : s.toCharArray()) freq[c-'a']++;
        
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()) {
            t.push(c);
            freq[c-'a']--;
            // find element from stack to result p
            while(!t.isEmpty()) {
                // smaller chars not pushed yet, break
                if (findSmaller(t.peek(), freq)) break; 
                sb.append(t.pop());
            }
        }
        return sb.toString();
    }
    
    public boolean findSmaller(char c, int[] freq) {
        for(int i = 0; i < c-'a'; i++) {
            if (freq[i] > 0) return true;
        }
        return false;
    }
}