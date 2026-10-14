import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] graph = new int[][]{new int[]{1, 2, 3}, new int[]{0}, new int[]{0}, new int[]{0}};

            int result = sol.shortestPathLength(graph);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] graph = new int[][]{new int[]{1}, new int[]{0, 2, 4}, new int[]{1, 3, 4}, new int[]{2}, new int[]{1, 2}};

            int result = sol.shortestPathLength(graph);
            System.out.println("Example 2: " + result);
        }
    }
}
