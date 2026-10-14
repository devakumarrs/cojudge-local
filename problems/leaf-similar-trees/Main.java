import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            TreeNode root1 = buildTree(new Integer[]{3, 5, 1, 6, 2, 9, 8, null, null, 7, 4});
            TreeNode root2 = buildTree(new Integer[]{3, 5, 1, 6, 7, 4, 2, null, null, null, null, null, null, 9, 8});

            boolean result = sol.leafSimilar(root1, root2);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            TreeNode root1 = buildTree(new Integer[]{1, 2, 3});
            TreeNode root2 = buildTree(new Integer[]{1, 3, 2});

            boolean result = sol.leafSimilar(root1, root2);
            System.out.println("Example 2: " + result);
        }
    }

    private static TreeNode buildTree(Integer[] vals) {
        if (vals == null || vals.length == 0 || vals[0] == null) return null;
        TreeNode root = new TreeNode(vals[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int i = 1;
        while (!queue.isEmpty() && i < vals.length) {
            TreeNode curr = queue.poll();
            if (i < vals.length && vals[i] != null) {
                curr.left = new TreeNode(vals[i]);
                queue.offer(curr.left);
            }
            i++;
            if (i < vals.length && vals[i] != null) {
                curr.right = new TreeNode(vals[i]);
                queue.offer(curr.right);
            }
            i++;
        }
        return root;
    }

    private static String treeToString(TreeNode root) {
        if (root == null) return "[]";
        List<String> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode curr = queue.poll();
            if (curr == null) {
                res.add("null");
            } else {
                res.add(String.valueOf(curr.val));
                queue.offer(curr.left);
                queue.offer(curr.right);
            }
        }
        while (!res.isEmpty() && res.get(res.size() - 1).equals("null")) {
            res.remove(res.size() - 1);
        }
        return "[" + String.join(", ", res) + "]";
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
