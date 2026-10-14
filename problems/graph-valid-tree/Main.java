import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int n = 5;
            int[][] edges = new int[][]{new int[]{0, 1}, new int[]{0, 2}, new int[]{0, 3}, new int[]{1, 4}};

            boolean result = sol.validTree(n, edges);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int n = 5;
            int[][] edges = new int[][]{new int[]{0, 1}, new int[]{1, 2}, new int[]{2, 3}, new int[]{1, 3}, new int[]{1, 4}};

            boolean result = sol.validTree(n, edges);
            System.out.println("Example 2: " + result);
        }
    }
}
