import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int n = 6;
            int[][] edges = new int[][]{new int[]{0, 1}, new int[]{0, 2}, new int[]{2, 3}, new int[]{2, 4}, new int[]{2, 5}};

            int[] result = sol.sumOfDistancesInTree(n, edges);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int n = 1;
            int[][] edges = new int[][]{};

            int[] result = sol.sumOfDistancesInTree(n, edges);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}
