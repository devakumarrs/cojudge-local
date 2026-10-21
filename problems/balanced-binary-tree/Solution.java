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
    private record Pair(boolean isBalanced, int h) {
        static Pair EMPTY = new Pair(true, 0);
    };

    public boolean isBalanced(TreeNode root) {
        return helper(root).isBalanced;
    }

    private Pair helper(TreeNode root) {
        if (root == null) {
            return Pair.EMPTY;
        }
        Pair left = helper(root.left);
        Pair right = helper(root.right);
        boolean isBalanced = left.isBalanced &&
                right.isBalanced &&
                (Math.abs(left.h - right.h) <= 1);
        int h = 1 + Math.max(left.h, right.h);
        return new Pair(isBalanced, h);
    }
}