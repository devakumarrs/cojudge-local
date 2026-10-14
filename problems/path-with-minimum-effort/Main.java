import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] heights = new int[][]{new int[]{1, 2, 2}, new int[]{3, 8, 2}, new int[]{5, 3, 5}};

            int result = sol.minimumEffortPath(heights);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] heights = new int[][]{new int[]{1, 2, 3}, new int[]{3, 8, 4}, new int[]{5, 3, 5}};

            int result = sol.minimumEffortPath(heights);
            System.out.println("Example 2: " + result);
        }
    }
}
