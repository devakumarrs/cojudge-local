import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] graph = new int[][]{new int[]{1, 2}, new int[]{2, 3}, new int[]{5}, new int[]{0}, new int[]{5}, new int[]{}, new int[]{}};

            List<Integer> result = sol.eventualSafeNodes(graph);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] graph = new int[][]{new int[]{1, 2, 3, 4}, new int[]{1, 2}, new int[]{3, 4}, new int[]{0, 4}, new int[]{}};

            List<Integer> result = sol.eventualSafeNodes(graph);
            System.out.println("Example 2: " + result);
        }
    }
}
