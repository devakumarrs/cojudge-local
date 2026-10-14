import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] graph = new int[][]{new int[]{1, 2}, new int[]{3}, new int[]{3}, new int[]{}};

            List<List<Integer>> result = sol.allPathsSourceTarget(graph);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] graph = new int[][]{new int[]{4, 3, 1}, new int[]{3, 2, 4}, new int[]{3}, new int[]{4}, new int[]{}};

            List<List<Integer>> result = sol.allPathsSourceTarget(graph);
            System.out.println("Example 2: " + result);
        }
    }
}
