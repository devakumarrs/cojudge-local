import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] rectangles = new int[][]{new int[]{0, 0, 2, 2}, new int[]{1, 0, 2, 3}, new int[]{1, 0, 3, 1}};

            int result = sol.rectangleArea(rectangles);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] rectangles = new int[][]{new int[]{0, 0, 1000000000, 1000000000}};

            int result = sol.rectangleArea(rectangles);
            System.out.println("Example 2: " + result);
        }
    }
}
