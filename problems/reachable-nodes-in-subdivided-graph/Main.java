import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] edges = new int[][]{new int[]{0, 1, 10}, new int[]{0, 2, 1}, new int[]{1, 2, 2}};
            int maxMoves = 6;
            int n = 3;

            int result = sol.reachableNodes(edges, maxMoves, n);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] edges = new int[][]{new int[]{0, 1, 4}, new int[]{1, 2, 6}, new int[]{0, 2, 8}, new int[]{1, 3, 1}};
            int maxMoves = 10;
            int n = 4;

            int result = sol.reachableNodes(edges, maxMoves, n);
            System.out.println("Example 2: " + result);
        }
    }
}
