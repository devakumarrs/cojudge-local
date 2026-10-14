import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int height = 5;
            int width = 7;
            int[] tree = new int[]{2, 2};
            int[] squirrel = new int[]{4, 4};
            int[][] nuts = new int[][]{new int[]{3, 0}, new int[]{2, 5}};

            int result = sol.minDistance(height, width, tree, squirrel, nuts);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int height = 1;
            int width = 3;
            int[] tree = new int[]{0, 1};
            int[] squirrel = new int[]{0, 0};
            int[][] nuts = new int[][]{new int[]{0, 2}};

            int result = sol.minDistance(height, width, tree, squirrel, nuts);
            System.out.println("Example 2: " + result);
        }
    }
}
