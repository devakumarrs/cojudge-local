import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] polygon = new int[][]{new int[]{0, 0}, new int[]{0, 1}, new int[]{1, 1}, new int[]{1, 0}};

            boolean result = sol.isConvex(polygon);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] polygon = new int[][]{new int[]{0, 0}, new int[]{0, 10}, new int[]{10, 10}, new int[]{10, 0}, new int[]{5, 5}};

            boolean result = sol.isConvex(polygon);
            System.out.println("Example 2: " + result);
        }
    }
}
