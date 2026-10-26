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
    private static int[] none = new int[] { 0, 0 };

    public int diameterOfBinaryTree(TreeNode root) {
        return helper(root)[1];
    }

    private int[] helper(TreeNode root) {
        if (root == null) {
            return none;
        }
        if (root.left == null && root.right == null) {
            return none;
        }
        int[] left = helper(root.left);
        int[] right = helper(root.right);
        int d = left[0] + right[0];
        if (root.left != null) {
            d++;
        }
        if (root.right != null) {
            d++;
        }
        int h = 1 + Math.max(left[0], right[0]);
        d = Math.max(d, Math.max(left[1], right[1]));
        return new int[] { h, d };
    }
}