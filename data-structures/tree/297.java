// 297. Serialize and Deserialize Binary Tree

// better one
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        buildString(root, sb);
        return sb.toString();
    }
    
    private void buildString(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append("N").append(",");
        } else {
            sb.append(root.val).append(",");
            buildString(root.left, sb);
            buildString(root.right, sb);
        }
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Deque<String> nodes = new LinkedList<>();
        nodes.addAll(Arrays.asList(data.split(",")));
        return buildTree(nodes);
    }
    
    private TreeNode buildTree(Deque<String> nodes) {
        String val = nodes.remove();
        if (val.equals("N")) {
            return null;
        } else {
            TreeNode node = new TreeNode(Integer.valueOf(val));
            node.left = buildTree(nodes);
            node.right = buildTree(nodes);
            return node;
        }
    }
}

// mine......
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        String ret = ";";
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                TreeNode cur = queue.poll();
                if (cur == null) {
                    ret += "n,";
                    continue;
                } else {
                    ret = ret + Integer.toString(cur.val) + ",";
                }
                queue.add(cur.left);
                queue.add(cur.right);
            }
            ret = ret.substring(0, ret.length() - 1) + ";";
        }
        return ret;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        ArrayList<ArrayList<TreeNode>> list = new ArrayList<>();
        for (String level : data.split(";")) {
            if (level == "") continue;
            ArrayList<TreeNode> queue = new ArrayList<>();
            // compute children
            for (String val : level.split(",")) {
                // compute node value
                TreeNode node = null;
                if (!val.equals("n")) {
                    node = new TreeNode(Integer.valueOf(val));
                }
                queue.add(node);
            }
            list.add(queue);
        }
        int n = list.size() - 1;
        while(n != 0) {
            ArrayList<TreeNode> parent = list.get(n-1);
            ArrayList<TreeNode> children = list.get(n);
            int i = 0, j = 0;
            boolean left = true;
            while(i < parent.size() && j < children.size()) {
                if (parent.get(i) == null) {
                    i++;
                } else if (left) {
                    parent.get(i).left = children.get(j);
                    left = false;
                    j++;
                } else {
                    parent.get(i).right = children.get(j);
                    left = true;
                    i++;
                    j++;
                }    
            }
            n--;
        }
        return list.get(0).get(0);
    }
}