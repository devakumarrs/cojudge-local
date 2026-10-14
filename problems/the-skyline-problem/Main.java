import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] buildings = new int[][]{new int[]{2, 9, 10}, new int[]{3, 7, 15}, new int[]{5, 12, 12}, new int[]{15, 20, 10}, new int[]{19, 24, 8}};

            List<List<Integer>> result = sol.getSkyline(buildings);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] buildings = new int[][]{new int[]{0, 2, 3}, new int[]{2, 5, 3}};

            List<List<Integer>> result = sol.getSkyline(buildings);
            System.out.println("Example 2: " + result);
        }
    }
}
