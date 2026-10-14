import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] heightMap = new int[][]{new int[]{1, 4, 3, 1, 3, 2}, new int[]{3, 2, 1, 3, 2, 4}, new int[]{2, 3, 3, 2, 3, 1}};

            int result = sol.trapRainWater(heightMap);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] heightMap = new int[][]{new int[]{3, 3, 3, 3, 3}, new int[]{3, 2, 2, 2, 3}, new int[]{3, 2, 1, 2, 3}, new int[]{3, 2, 2, 2, 3}, new int[]{3, 3, 3, 3, 3}};

            int result = sol.trapRainWater(heightMap);
            System.out.println("Example 2: " + result);
        }
    }
}
