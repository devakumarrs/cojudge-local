import java.util.*;

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

class Solution {
    List<Integer> result;

    public int[] rightSideView(TreeNode root) {
        result = new ArrayList<>();
        helper(root, 0);
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    private void helper(TreeNode root, int h) {
        if (root == null)
            return;
        if (result.size() == h) {
            result.add(root.val);
        }
        helper(root.right, h + 1);
        helper(root.left, h + 1);
    }
}
