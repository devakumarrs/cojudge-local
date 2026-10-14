import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int n = 4;
            int[][] edges = new int[][]{new int[]{1, 0}, new int[]{1, 2}, new int[]{1, 3}};

            int[] result = sol.findMinHeightTrees(n, edges);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int n = 6;
            int[][] edges = new int[][]{new int[]{3, 0}, new int[]{3, 1}, new int[]{3, 2}, new int[]{3, 4}, new int[]{5, 4}};

            int[] result = sol.findMinHeightTrees(n, edges);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}
