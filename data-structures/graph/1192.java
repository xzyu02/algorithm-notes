// 1192. Critical Connections in a Network

class Solution {
    int[] visited, lowLink;
    List<Integer>[] graph;
    List<List<Integer>> res;
    int id = 0;
    
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        visited = new int[n];
        Arrays.fill(visited, -1); // -1 mark as unvisited for all nodes
        lowLink = new int[n];
        res = new ArrayList<>();
        // adjacent list for graph building
        graph = new ArrayList[n];
        for(int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        for(List<Integer> cur : connections) {
            int s = cur.get(0), t = cur.get(1);
            graph[s].add(t);
            graph[t].add(s);
        }
        // tarjar's algorithm, start with dfs
        dfs(0, -1);
        return res;
    }
    
    private void dfs(int u, int parent) {
        visited[u] = lowLink[u] = id++;
        for(int v : graph[u]) {
            if (v == parent) continue; // ignore parent vertex 
            if (visited[v] == -1) {
                dfs(v, u);
            }
            lowLink[u] = Math.min(lowLink[u], lowLink[v]);
            if (lowLink[v] > visited[u]) {
                // u - v is critical because v cannot reach from without this path
                res.add(Arrays.asList(u, v));
            }
        }
    }
}