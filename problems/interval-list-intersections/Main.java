import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] firstList = new int[][]{new int[]{0, 2}, new int[]{5, 10}, new int[]{13, 23}, new int[]{24, 25}};
            int[][] secondList = new int[][]{new int[]{1, 5}, new int[]{8, 12}, new int[]{15, 24}, new int[]{25, 26}};

            int[][] result = sol.intervalIntersection(firstList, secondList);
            System.out.println("Example 1: " + Arrays.deepToString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] firstList = new int[][]{new int[]{1, 3}, new int[]{5, 9}};
            int[][] secondList = new int[][]{};

            int[][] result = sol.intervalIntersection(firstList, secondList);
            System.out.println("Example 2: " + Arrays.deepToString(result));
        }
    }
}
