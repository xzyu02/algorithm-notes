// 207. Course Schedule

class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] indegree = new int[numCourses];
        ArrayList<Integer>[] adjList = new ArrayList[numCourses];
        for(int i = 0; i < numCourses; i++)
            adjList[i] = new ArrayList<>(); // initialize
        for(int[] i : prerequisites) {
            adjList[i[1]].add(i[0]);
            indegree[i[0]]++;
        }
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < indegree.length; i++) {
            if(indegree[i] == 0) queue.add(i);
        }
        int cnt = 0;
        while(!queue.isEmpty()) {
            int cur = queue.poll();
            cnt++;
            for(int out : adjList[cur]) 
                if(--indegree[out] == 0) queue.add(out);
        }
        return cnt == numCourses;
    }
}