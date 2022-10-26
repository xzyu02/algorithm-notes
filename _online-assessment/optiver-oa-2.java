import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        String firstLine = sc.nextLine(); // read from STDIN
        String[] inputs = firstLine.split(" "); // split it
        // Capitalized Letters HashSet
        HashSet<Character> capLetters = new HashSet<>();
        for(char c = 'A'; c <= 'Z'; c++) capLetters.add(c);
        // check duplicate pairs
        boolean isDup = false;
        HashSet<String> pastPairs = new HashSet<>(); 
        // check more than 2 children
        boolean isMoreThanTwo = false;
        // check indegree for each node
        int[] indegree = new int[26];
        // adjacent graph
        HashMap<Character, List<Character>> graph = new HashMap<>();
        // iterate each pair
        for(String s : inputs) {
            char from = s.charAt(1), to = s.charAt(3);
            // check format error
            if (s.length() != 5 || s.charAt(0) != '(' || !capLetters.contains(from) || s.charAt(2) != ',' || !capLetters.contains(to) || s.charAt(4) != ')') {
                System.out.println("E1");
                return;
            }
            if (pastPairs.contains(s)) {
                isDup = true;
                break;
            }
            // add value to different fields
            pastPairs.add(s);
            List<Character> children = graph.getOrDefault(from, new ArrayList());
            children.add(to);
            if (children.size() > 2) {
                isMoreThanTwo = true;
                break;
            }
            graph.put(from, children);
            indegree[to - 'A']++;
        }
        if (isDup) {
            System.out.println("E2");
            return;
        }
        if (isMoreThanTwo) {
            System.out.println("E3");
            return;
        }
        
        Queue<Character> queue = new LinkedList<>();
        for (char c = 'A'; c <= 'Z'; c++) {
            if (indegree[c-'A'] == 0 && graph.containsKey(c)) {
                queue.add(c);
            }
        }
        // more than 1 root
        if (queue.size() > 1) {
            System.out.println("E4");
            return;
        }
        // cycle found
        if (queue.size() == 0) {
            System.out.println("E5");
            return;
        }
        char root = queue.peek(); // save for future use
        // different case
        int cntNodes = 0;
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                char cur = queue.poll();
                List<Character> children = graph.get(cur);
                if (children == null) {
                    continue;
                }
                for (char c : children) {
                    indegree[c - 'A']--;
                    if (indegree[c - 'A'] == 0) {
                        queue.add(c);
                        cntNodes++;
                    }
                }
            }
        }
        if (cntNodes < inputs.length) {
            System.out.println("E5");
            return;
        }
        // print s rep
        HashSet<Character> visited = new HashSet<>();
        String ret = sRepsentation(root, graph, visited);
        System.out.println(ret);
        return;
    }
    
    public static String sRepsentation(Character root, HashMap<Character, List<Character>> graph, HashSet<Character> visited) {
        // find leaf node
        if (graph.get(root) == null || !graph.containsKey(root)) {
            return "(" + root + ")";
        }
        visited.add(root);
        String ret = "";
        // dfs
        for (Character child : graph.get(root)) {
            if (visited.contains(child)) {
                continue;
            }
            ret += sRepsentation(child, graph, visited); 
            // System.out.println(cur);
        }
        return "(" + root + ret + ")";
    }
}