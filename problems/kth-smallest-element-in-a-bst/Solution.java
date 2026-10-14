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
    private TreeNode result;
    private int index;

    public int kthSmallest(TreeNode root, int k) {
        result = null;
        index = 0;
        helper(root, k);
        return result.val;
    }

    private void helper(TreeNode root, int k) {
        if (root == null)
            return;
        helper(root.left, k);
        index++;
        if (k == index) {
            result = root;
        }
        helper(root.right, k);
    }
}
