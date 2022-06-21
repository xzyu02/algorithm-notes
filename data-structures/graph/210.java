// 210. Course Schedule II

class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] indegree = new int[numCourses];
        HashMap<Integer, List<Integer>> from = new HashMap<>();
        for(int[] i : prerequisites) {
            int t = i[0], s = i[1];
            indegree[t] += 1; 
            List<Integer> arr = from.getOrDefault(s, new ArrayList<>());
            arr.add(t);
            from.put(s, arr);
        }
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < indegree.length; i++) {
            if(indegree[i] == 0) {
                queue.offer(i);
            }
        }
        int[] odr = new int[numCourses];
        int i = 0;
        while(!queue.isEmpty()) {
            int cur = queue.poll();
            odr[i++] = cur;
            if (from.containsKey(cur)) {
                for(int node : from.get(cur)) {
                    indegree[node] -= 1; 
                    if (indegree[node] == 0) {
                        queue.offer(node);
                    }
                }
            }
        }
        return i == numCourses ? odr : new int[0];
    }
}