import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] matrix = new int[][]{new int[]{3, 0, 1, 4, 2}, new int[]{5, 6, 3, 2, 1}, new int[]{1, 2, 0, 1, 5}, new int[]{4, 1, 0, 1, 7}, new int[]{1, 0, 3, 0, 5}};
            String[] operations = new String[]{"sumRegion", "update", "sumRegion"};
            int[][] values = new int[][]{new int[]{2, 1, 4, 3}, new int[]{3, 2, 2}, new int[]{2, 1, 4, 3}};

            int[] result = sol.runNumMatrix(matrix, operations, values);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] matrix = new int[][]{new int[]{1}};
            String[] operations = new String[]{"sumRegion", "update", "sumRegion"};
            int[][] values = new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 5}, new int[]{0, 0, 0, 0}};

            int[] result = sol.runNumMatrix(matrix, operations, values);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}
