// 785. Is Graph Bipartite?

class Solution {
    public boolean isBipartite(int[][] graph) {
        int[] nodeColor = new int[graph.length];
        for(int i = 0; i < graph.length; i++) {
            if(nodeColor[i] == 0 && !color(graph, nodeColor, i, 1)) {
                return false;
            }
        }
        return true;
    }
    
    public boolean color(int[][] graph, int[] nodeColor, int node, int color) {
        if (nodeColor[node] != 0) {
            // current node already colored, if old color is not the same as new color, then graph is not bipartite
            return nodeColor[node] == color;
        }
        nodeColor[node] = color;
        for(int n : graph[node]) {
            if (nodeColor[n] != -color && !color(graph, nodeColor, n, -color)) {
                return false;
            }
        }
        return true;
    }
}