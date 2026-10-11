/*
 * Definition for a binary tree node. class TreeNode { int val; TreeNode left; TreeNode right;
 * TreeNode() {} TreeNode(int val) { this.val = val; } TreeNode(int val, TreeNode left, TreeNode
 * right) { this.val = val; this.left = left; this.right = right; } }
 */
import java.util.*;

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> results = new ArrayList<>();
        Deque<TreeNode> dq = new ArrayDeque<>();
        if (root != null) {
            dq.offer(root);
        }
        while (!dq.isEmpty()) {
            int size = dq.size();
            List<Integer> result = new ArrayList<>(size);
            for (int i = 0; i < size; i++) {
                TreeNode node = dq.poll();
                result.add(node.val);
                if (node.left != null) {
                    dq.offer(node.left);
                }
                if (node.right != null) {
                    dq.offer(node.right);
                }
            }
            results.add(result);
        }
        return results;
    }
}
