import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] points = new int[][]{new int[]{1, 1}, new int[]{1, 3}, new int[]{3, 1}, new int[]{3, 3}, new int[]{2, 2}};

            int result = sol.minAreaRect(points);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] points = new int[][]{new int[]{1, 1}, new int[]{1, 3}, new int[]{3, 1}, new int[]{3, 3}, new int[]{4, 1}, new int[]{4, 3}};

            int result = sol.minAreaRect(points);
            System.out.println("Example 2: " + result);
        }
    }
}
