import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] trees = new int[][]{new int[]{1, 1}, new int[]{2, 2}, new int[]{2, 0}, new int[]{2, 4}, new int[]{3, 3}, new int[]{4, 2}};

            List<List<Integer>> result = sol.outerTrees(trees);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] trees = new int[][]{new int[]{1, 2}, new int[]{2, 2}, new int[]{4, 2}};

            List<List<Integer>> result = sol.outerTrees(trees);
            System.out.println("Example 2: " + result);
        }
    }
}
