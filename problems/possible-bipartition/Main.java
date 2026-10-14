import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int n = 4;
            int[][] dislikes = new int[][]{new int[]{1, 2}, new int[]{1, 3}, new int[]{2, 4}};

            boolean result = sol.possibleBipartition(n, dislikes);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int n = 3;
            int[][] dislikes = new int[][]{new int[]{1, 2}, new int[]{1, 3}, new int[]{2, 3}};

            boolean result = sol.possibleBipartition(n, dislikes);
            System.out.println("Example 2: " + result);
        }
    }
}
