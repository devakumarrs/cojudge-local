
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
    private record Pair(int max, int childMax) {
        static final Pair EMPTY = new Pair(0, 0);
    }

    public int rob(TreeNode root) {
        var pair = robHelper(root);
        return pair.max;
    }

    private Pair robHelper(TreeNode root) {
        if (root == null) {
            return Pair.EMPTY;
        }
        var leftPair = robHelper(root.left);
        var rightPair = robHelper(root.right);

        int childMax = leftPair.max + rightPair.max;
        int max = Math.max(childMax, root.val + leftPair.childMax + rightPair.childMax);
        return new Pair(max, childMax);
    }
}