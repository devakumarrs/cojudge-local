import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] rectangles = new int[][]{new int[]{1, 1, 3, 3}, new int[]{3, 1, 4, 2}, new int[]{3, 2, 4, 4}, new int[]{1, 3, 2, 4}, new int[]{2, 3, 3, 4}};

            boolean result = sol.isRectangleCover(rectangles);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] rectangles = new int[][]{new int[]{1, 1, 2, 3}, new int[]{1, 3, 2, 4}, new int[]{3, 1, 4, 2}, new int[]{3, 2, 4, 4}};

            boolean result = sol.isRectangleCover(rectangles);
            System.out.println("Example 2: " + result);
        }
    }
}
