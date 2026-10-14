import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int n = 5;
            int[][] edges = new int[][]{new int[]{0, 1, 1}, new int[]{1, 2, 1}, new int[]{2, 3, 2}, new int[]{0, 3, 2}, new int[]{0, 4, 3}, new int[]{3, 4, 3}, new int[]{1, 4, 6}};

            int[][] result = sol.findCriticalAndPseudoCriticalEdges(n, edges);
            System.out.println("Example 1: " + Arrays.deepToString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int n = 4;
            int[][] edges = new int[][]{new int[]{0, 1, 1}, new int[]{1, 2, 1}, new int[]{2, 3, 1}, new int[]{0, 3, 1}};

            int[][] result = sol.findCriticalAndPseudoCriticalEdges(n, edges);
            System.out.println("Example 2: " + Arrays.deepToString(result));
        }
    }
}
