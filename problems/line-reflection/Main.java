import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] points = new int[][]{new int[]{1, 1}, new int[]{-1, 1}};

            boolean result = sol.isReflected(points);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] points = new int[][]{new int[]{1, 1}, new int[]{-1, -1}};

            boolean result = sol.isReflected(points);
            System.out.println("Example 2: " + result);
        }
    }
}
