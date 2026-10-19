
/*
Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left = left; this.right = right; }
}
*/
import java.util.*;

class Solution {
    private record Pair(int max, int childMax) {
    }

    public int rob(TreeNode root) {
        if (root == null)
            return 0;
        Map<TreeNode, Pair> map = new HashMap<>();
        var pair = rob(root, map);
        return pair.max;
    }

    private Pair rob(TreeNode root, Map<TreeNode, Pair> map) {
        if (root == null) {
            return new Pair(0, 0);
        }
        if (map.containsKey(root)) {
            return map.get(root);
        }
        var leftPair = rob(root.left, map);
        var rightPair = rob(root.right, map);

        int childMax = leftPair.max + rightPair.max;
        int max = Math.max(childMax, root.val + leftPair.childMax + rightPair.childMax);
        map.put(root, new Pair(max, childMax));
        return map.get(root);
    }
}