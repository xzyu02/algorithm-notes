// 684. Redundant Connection

class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int[] parents = new int[edges.length + 1];
        for(int i = 0; i < parents.length; i++)
            parents[i] = i;
        for(int[] edge : edges) {
            int s = edge[0], t = edge[1];
            if (find(parents, s) == find(parents, t)) {
                return edge;
            } else {
                union(s, t, parents);
            }
        }
        return null;
    }
    
    private int find(int[] parents, int node) {
        if(parents[node] != node) return find(parents, parents[node]);
        return parents[node];
    }
    
    private void union(int s, int t, int[] parents) {
        int sParent = find(parents, s);
        int tParent = find(parents, t);
        parents[sParent] = tParent; 
    }
}