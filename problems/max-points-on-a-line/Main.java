import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] points = new int[][]{new int[]{1, 1}, new int[]{2, 2}, new int[]{3, 3}};

            int result = sol.maxPoints(points);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] points = new int[][]{new int[]{1, 1}, new int[]{3, 2}, new int[]{5, 3}, new int[]{4, 1}, new int[]{2, 3}, new int[]{1, 4}};

            int result = sol.maxPoints(points);
            System.out.println("Example 2: " + result);
        }
    }
}
