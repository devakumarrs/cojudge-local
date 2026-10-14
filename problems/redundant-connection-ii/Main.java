import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] edges = new int[][]{new int[]{1, 2}, new int[]{1, 3}, new int[]{2, 3}};

            int[] result = sol.findRedundantDirectedConnection(edges);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] edges = new int[][]{new int[]{1, 2}, new int[]{2, 3}, new int[]{3, 4}, new int[]{4, 1}, new int[]{1, 5}};

            int[] result = sol.findRedundantDirectedConnection(edges);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}
