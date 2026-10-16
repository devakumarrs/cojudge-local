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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        helper(root, sb1);
        helper(subRoot, sb2);
        return sb1.indexOf(sb2.toString()) > -1;
    }

    private void helper(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append("N,");
            return;
        }
        sb.append('#');
        sb.append(root.val);
        sb.append(',');
        helper(root.left, sb);
        helper(root.right, sb);
    }
}