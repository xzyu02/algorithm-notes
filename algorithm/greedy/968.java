// 968. Binary Tree Cameras

class Solution {
    int notCovered = 0, camera = 1, covered = 2;
    // 3 layers from bottom to up: notCovered - Camera - covered
    int num = 0; // record total cameras
    
    public int minCameraCover(TreeNode root) {
        return dfs(root) == 0 ? num + 1 : num;
    }
    
    private int dfs(TreeNode root) {
        // greedy assume leaf is `notCovered` layer, then null after leaf is `covered` layer
        if (root == null) return covered; 
        int left = dfs(root.left), right = dfs(root.right);
        if (left == notCovered || right == notCovered) {
            num += 1; // leaf nodes are notCovered, then put camera on current layer
            return camera;
        } else if (left == camera || right == camera) {
            return covered;
        }
        return notCovered;
    }
}