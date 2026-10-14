import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] triangle = new int[][]{new int[]{2}, new int[]{3, 4}, new int[]{6, 5, 7}, new int[]{4, 1, 8, 3}};

            int result = sol.minimumTotal(triangle);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] triangle = new int[][]{new int[]{-10}};

            int result = sol.minimumTotal(triangle);
            System.out.println("Example 2: " + result);
        }
    }
}
