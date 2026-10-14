import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] points = new int[][]{new int[]{0, 0}, new int[]{0, 1}, new int[]{1, 0}, new int[]{0, 2}, new int[]{2, 0}};

            String result = sol.largestTriangleArea(points);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] points = new int[][]{new int[]{1, 0}, new int[]{0, 0}, new int[]{0, 1}};

            String result = sol.largestTriangleArea(points);
            System.out.println("Example 2: " + result);
        }
    }
}
