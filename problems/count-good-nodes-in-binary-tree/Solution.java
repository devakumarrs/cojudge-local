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
    int count;

    public int goodNodes(TreeNode root) {
        count = 0;
        helper(root, -(int) 1e4 - 1);
        return count;
    }

    private void helper(TreeNode root, int max) {
        if (root == null)
            return;
        if (max <= root.val) {
            count++;
            max = root.val;
        }
        helper(root.left, max);
        helper(root.right, max);
    }
}