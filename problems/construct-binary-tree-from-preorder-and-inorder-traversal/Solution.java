import java.util.*;

/*
 * Definition for a binary tree node. class TreeNode { int val; TreeNode left; TreeNode right;
 * TreeNode() {} TreeNode(int val) { this.val = val; } TreeNode(int val, TreeNode left, TreeNode
 * right) { this.val = val; this.left = left; this.right = right; } }
 */
class Solution {
    private int index;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        index = 0;
        return buildTree(preorder, inorder, map, 0, inorder.length - 1);
    }

    private TreeNode buildTree(int[] preorder, int[] inorder, Map<Integer, Integer> map, int left,
            int right) {
        if (left > right || index >= preorder.length) {
            return null;
        }
        int val = preorder[index++];
        TreeNode root = new TreeNode(val);
        root.left = buildTree(preorder, inorder, map, left, map.get(val) - 1);
        root.right = buildTree(preorder, inorder, map, map.get(val) + 1, right);
        return root;
    }
}
