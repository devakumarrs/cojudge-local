import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int m = 3;
            int n = 3;
            int[][] ops = new int[][]{new int[]{2, 2}, new int[]{3, 3}};

            int result = sol.maxCount(m, n, ops);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int m = 3;
            int n = 3;
            int[][] ops = new int[][]{new int[]{2, 2}, new int[]{3, 3}, new int[]{3, 3}, new int[]{3, 3}, new int[]{2, 2}, new int[]{3, 3}, new int[]{3, 3}, new int[]{3, 3}, new int[]{2, 2}, new int[]{3, 3}, new int[]{3, 3}, new int[]{3, 3}};

            int result = sol.maxCount(m, n, ops);
            System.out.println("Example 2: " + result);
        }
    }
}
